package com.example.kotlin_study_gallery

import android.content.ContentUris
import android.content.Intent
import android.content.pm.PackageManager
import android.database.Cursor
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.lifecycle.lifecycleScope
import com.bumptech.glide.Glide
import com.example.kotlin_study_gallery.databinding.ActivityGalleryBinding
import kotlinx.coroutines.launch

class GalleryActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityGalleryBinding.inflate(layoutInflater)
    }
    private val imageList = arrayListOf<Uri>()
    private val adapter = GalleryAdapter()
    private val PERMISSIONS_REQUEST_CODE = 100
    private var REQUIRED_PERMISSIONS =if(Build.VERSION.SDK_INT <33){
        arrayOf<String>(android.Manifest.permission.READ_EXTERNAL_STORAGE)
    }else{
        arrayOf<String>(android.Manifest.permission.READ_MEDIA_IMAGES)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        init()

    }

    fun init() {
        setPermission()
        clickImage()
    }
    private fun setPermission(){
        when {
            // 갤러리 접근 권한이 있는 겨우
            ContextCompat.checkSelfPermission(
                this,
                REQUIRED_PERMISSIONS[0]
            ) == PackageManager.PERMISSION_GRANTED -> {
                showGallery()
                Log.d("LOG", "갤러리 접근 권한이 있는 경우")
            }
            // 갤러리 접근 권한이 없는 경우 && 교육용 팝업을 보여줘야 하는 경우
            shouldShowRequestPermissionRationale(REQUIRED_PERMISSIONS[0])
            -> {
                requestPermission()

                Log.d("LOG", "갤러리 접근 권한이 없는 경우 && 교육용 팝업을 보여줘야 하는 경우")
            }

            // 권한 요청 하기
            else -> {
                requestPermission()


            }
        }
    }


    private fun requestPermission() {
        var permissionCheck = ContextCompat.checkSelfPermission(
            this,
            REQUIRED_PERMISSIONS[0]
        )
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            //설명이 필요한지
            if (ActivityCompat.shouldShowRequestPermissionRationale(
                    this,
                    REQUIRED_PERMISSIONS[0]
                )
            ) {
                //설명 필요 (사용자가 요청을 거부한 적이 있음)
                Log.d("설명", "사용자가 요청을 거부 한적이 있다.")
                ActivityCompat.requestPermissions(
                    this,
                    REQUIRED_PERMISSIONS,
                    PERMISSIONS_REQUEST_CODE
                )
            } else {
                //설명 필요하지 않음
                Log.d("설명x", "사용자가 요청을 거부 한적이 있다.")
                ActivityCompat.requestPermissions(
                    this,
                    REQUIRED_PERMISSIONS,
                    PERMISSIONS_REQUEST_CODE
                )
            }
        } else {
            Log.d("허용..?", "사용자가 요청을 거부 한적이 있다.")
            //권한 허용
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int, permissions: Array<out String>, grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            PERMISSIONS_REQUEST_CODE -> {
                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    showGallery()
                } else {
                    //권한 거부됨
                }
                return
            }
        }
    }

    private fun getCursor(): Cursor? {
        val projection = arrayOf(
            MediaStore.Images.ImageColumns._ID,
            MediaStore.Images.ImageColumns.TITLE,
            MediaStore.Images.ImageColumns.DATE_TAKEN,
        )
        val selection = null
        val selectionArgs = null
        val sortOrder = "${MediaStore.Images.ImageColumns.DATE_TAKEN} DESC"

        //1건만 가져오려면?
        //Uri 및 Uri.Builder 클래스에는 문자열에서 올바른 형식의 URI 객체를 구성하기 위한 편의 메서드가 포함되어 있습니다.
        //Uri.Builder는 URI 참조를 빌드하거나 조작하기 위한 도우미 클래스입니다.
        //appendQueryParameter : Encodes the key and value and then appends the parameter to the query string.
        //val queryUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI
        //queryUri.buildUpon().appendQueryParameter("limit", "1").build()

        return contentResolver.query(
            //Uri: 찾고자하는 데이터의 Uri입니다. 접근할 앱에서 정의됨. 내 앱에서 만들고 싶다면 manifest에서 만들 수 있음.
            MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
            projection,
            selection,
            selectionArgs,
            sortOrder
        )

    }

    private fun showGallery() {
        //내부 오류가 발생하는 경우, 쿼리 결과는 특정 제공자에 따라 달라집니다. null을 반환하기로 선택할 수도 있고, Exception을 발생시킬 수도 있습니다.
        //따라서 try catch & try 내에서도 cursor이 null로 반환되는 경우를 모두 처리해줌.
        lifecycleScope.launch { //비동기 처리
            Log.d("비동기 시작", "ShowGallery")
            try {
                val cursor = getCursor()
                when (cursor?.count) {
                    null -> {
                        /*
                         * 에러 대응 코드 작성. cursor 사용하지 말것!!
                         * You may want to call android.util.Log.e() to log this error.
                         *
                         */
                        Log.d("NULL", "NULL")
                    }
                    0 -> {
                        /*
                         *사용자에게 검색이 실패했음을 알리려면 여기에 코드를 삽입하십시오.
                         * 무조건 에러는 아니다. 테이블을 못찾은게 아니라 말 그대로 테이블에 행이 0개 일 수도.
                         * 사용자에게 새 항목을 삽입할 수 있는 옵션을 제공할 수 있습니다.
                         * 행 또는 검색어를 다시 입력하십시오.
                         */
                        Log.d("failed", "실패")
                    }
                    else -> {
                        //결과가 1개이상 검색 됨
                        //커서를 맨 앞으로 이동.
                        //true를 반환해야 데이터가 있는 것임.
                        while (cursor.moveToNext()) {
                            //1. 각 컬럼의 열 인덱스를 취득한다.
                            val idColNum =
                                cursor.getColumnIndexOrThrow(MediaStore.Images.ImageColumns._ID)
                            val titleColNum =
                                cursor.getColumnIndexOrThrow(MediaStore.Images.ImageColumns.TITLE)
                            val dateTakenColNum =
                                cursor.getColumnIndexOrThrow(MediaStore.Images.ImageColumns.DATE_TAKEN)

                            //2. 인덱스를 바탕으로 각 행의 열 값(마지막 행에 도달할 때 까지 1행의 id,title,dateTaken, 2행의 id,title,dateTaken...)을 Cursor로부터 취득하기
                            val id = cursor.getLong(idColNum)
                            val title = cursor.getString(titleColNum)
                            val dateTaken = cursor.getLong(dateTakenColNum)
                            /*Cursor를 통해 얻은 ID로 Uri 정보를 얻을 수 있습니다.
                            쿼리를 요청한 Uri와 파일의 ID가 다음과 같이 주어졌다면,

                            MediaStore.Audio.Media.EXTERNAL_CONTENT_URI : content://media/external/audio/media
                            File ID : 13492
                            이 파일의 Uri는 다음처럼 두개의 스트링을 합친 값이 됩니다.
                            content://media/external/audio/media/13492
                            String이 아닌 Uri 객체로 얻으려면 다음처럼 Uri.withAppendedPath()를 이용하시면 됩니다.*/
                            val imageUri =
                                ContentUris.withAppendedId(
                                    MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
                                    id
                                )

                            imageList.add(imageUri)//recylcerview에 넣기 위한 uri list

                            Log.d(
                                "LOGGING",
                                "id: ${id}, title:$title, dateTaken : $dateTaken, imageUri : $imageUri"
                            )

                        }
                        cursor.close() //사용한 cursor는 꼭 close 해줘야함
                        Log.d("imageList", imageList.toString())

                    }

                }
            } catch (e: Exception) {
                //에러 대응 코드 작성
                Toast.makeText(this@GalleryActivity, "에러 스토리지에 접근 권한을 허가해주세요", Toast.LENGTH_SHORT)
                    .show()
                finish()
            }

        }
        binding.recyclerView.adapter = adapter
        adapter.setImageList(imageList)
    }

    private fun clickImage() {
        adapter.setOnItemClickListener(object : GalleryAdapter.OnItemClickListener {
            override fun onItemClick(v: View, data: Uri, position: Int) {
                val intent = Intent(this@GalleryActivity,CropperActivity::class.java)
                intent.putExtra("image",data)
                startActivity(intent)
            }

            override fun onLongClick(v: View, data: Uri, position: Int) {
                Log.d("click", "길게 누르지마")
            }

        })
    }
    //cursor의 값을 가공하지 않고 바로 ui에 띄우고 싶다면 simpleCursorAdapter를 이용해서 listView에 띄우면 된다.
    //simpleCursorAdpater : 커서의 열을 XML 파일에 정의된 TextView 또는 ImageView로 매핑하는 간편한 어댑터입니다.
}