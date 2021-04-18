package com.example.resend;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Message;
import android.os.Messenger;

import androidx.annotation.Nullable;

public class DatabaseMess extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "Mess";
    private static final int DATABASE_VERSION = 1;

    private static final String KEY_GROUP="Group_";//группа(чат)
    private static final String KEY_MESS="Mess"; //седержание сообщения
    private static final String KEY_SENDER="Sender";//отправитель
    private static final String KEY_RECIPIENT = "Recipient";//получатель
    private static final String KEY_MESSENDER= "Messenger";//соц. сеть.
    private static final String KEY_TIME ="Time";//время
    private static final String KEY_ID="Id";// уникальный id сообщения


    public DatabaseMess(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String mess = "CREATE TABLE " + KEY_ID + "(_id INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_MESSENDER + "TEXT, "+ KEY_SENDER + "TEXT, "+ KEY_RECIPIENT + "TEXT, " +
                 KEY_MESS + "TEXT, "+ KEY_GROUP + "TEXT, "+ KEY_TIME + "NUMERIC); ";
        sqLiteDatabase.execSQL(mess);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
