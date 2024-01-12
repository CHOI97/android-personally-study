package com.example.myapplication

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(private val context: Context?) :
    SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    companion object {
        const val DATABASE_VERSION = 1
        const val DATABASE_NAME = "MEMO"

        const val TABLE_NAME = "TEST_TABLE"
        const val INDEX = 0
        const val COL_MEMO_CONTENT = "CONTENT"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        var sql: String = "CREATE TABLE IF NOT EXISTS " +
                "$TABLE_NAME ($INDEX integer primary key autoincrement, " +
                "$COL_MEMO_CONTENT text);"
        db?.execSQL(sql)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        val sql = "DROP TABLE IF EXISTS $TABLE_NAME"
        db?.execSQL(sql)
        onCreate(db)
    }

    fun addMemo(memo: Memo) {
        val db = this.writableDatabase
        var sql = "INSERT INTO $TABLE_NAME(${memo.index}) values(${memo.content}"
        db.execSQL(sql)
        db.close()
    }

    //    fun addMemo(memo: Memo){
//        val db = this.writableDatabase
//        val values = ContentValues().apply{
//            put(INDEX,memo.index)
//            put(COL_MEMO_CONTENT,memo.content)
//        }
//        db.insert(TABLE_NAME,null,values)
//        db.close()
//    }

}