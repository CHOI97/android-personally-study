package com.example.kotlin_study_gallery

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin_study_gallery.databinding.ActivityCropperBinding
import com.takusemba.cropme.OnCropListener
import java.io.ByteArrayOutputStream
import java.util.*


class CropperActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityCropperBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val cropLayout = binding.clCropImage
        cropLayout.setUri(intent.getParcelableExtra("image")!!)
        binding.btnCrop.setOnClickListener {
            cropLayout.crop()
        }
        cropLayout.addOnCropListener(object : OnCropListener {
            // 성공했을 때,
            override fun onSuccess(bitmap: Bitmap) {
                val intent = Intent(this@CropperActivity, MainActivity::class.java)
                val image = bitmapToString(bitmap)
                val image2 = getImageUri(this@CropperActivity,bitmap)
                intent.putExtra("crop", image2)
                Log.d("success", "성공")
                startActivity(intent)
            }

            // 실패했을 때,
            override fun onFailure(e: Exception) {
                Log.e("Failure", "$e")
                Log.d("Failure", "failed")
            }
        })

    }

    private fun getImageUri(context: Context, inImage: Bitmap): Uri? {
        val bytes = ByteArrayOutputStream()
        inImage.compress(Bitmap.CompressFormat.JPEG, 100, bytes)
        val path = MediaStore.Images.Media.insertImage(
            context.contentResolver,
            inImage,
            "Title",
            null
        )
        return Uri.parse(path)
    }

    fun bitmapToString(bitmap: Bitmap): String {
        val stream = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream)

        val bytes = stream.toByteArray()
        return Base64.getEncoder().encodeToString(bytes)
    }

}