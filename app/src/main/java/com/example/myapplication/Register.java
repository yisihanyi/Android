package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends AppCompatActivity {
    private DatabaseHelper helper;
    private EditText edit1;
    private EditText edit2;
    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        edit1=(EditText)findViewById(R.id.edit_text1);
        edit2=(EditText)findViewById(R.id.edit_text2);
        txt=(TextView)findViewById(R.id.textView);
        Button button =(Button)findViewById(R.id.button);
        helper=new DatabaseHelper(this,"Database",null,2);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                insertData();
            }
        });
    }
        private void insertData() {
            if (edit1.getText().toString().equals("")) {
                txt.setText("请输入学号！");
                return;
            } else if (edit2.getText().toString().equals("")) {
                txt.setText("请输入密码！");
                return;
            } else {
                SQLiteDatabase db = helper.getWritableDatabase();
                String select = "select * from USER where STU_NUM=" + edit1.getText() + " ";
                String insert1 = "Insert into USER(STU_NUM,PASSWORD) values(" + edit1.getText() + "," + edit2.getText() + ")";
                String insert2 = "Insert into CHOOSE(STU_NUM) values(" + edit1.getText() + ")";
                Log.i("Database:", "createDB=" + select);
                Cursor cursor = db.rawQuery(select, null);
                StringBuilder s = new StringBuilder();
                int i = 0;
                while (cursor.moveToNext()) {
                    s.append(cursor.getInt(cursor.getColumnIndex("STU_NUM")));
                    s.append(cursor.getInt(cursor.getColumnIndex("PASSWORD")));
                    i++;
                }
                if (i != 0) {
                    txt.setText("该用户已存在！");
                } else {
                    Log.i("Database", "createDB=" + insert1);
                    db.execSQL(insert1);
                    Log.i("Database", "createDB=" + insert2);
                    db.execSQL(insert2);
                    txt.setText("注册成功！");
                }
            }
        }
    }
