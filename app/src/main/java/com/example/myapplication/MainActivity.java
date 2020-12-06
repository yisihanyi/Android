package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    private EditText edit1;
    private EditText edit2;
    private TextView txt1;
    private DatabaseHelper helper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1=(EditText)findViewById(R.id.edit_text);
        edit2=(EditText)findViewById(R.id.editPassword);
        txt1=(TextView)findViewById(R.id.textView);
        Button button1 =(Button)findViewById(R.id.button_1);
        helper=new DatabaseHelper(this,"Database",null,2);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Login();
            }
        });
        Button button2 =(Button)findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Register.class);
                startActivity(intent);

            }
        });
    }
    private void Login() {
        SQLiteDatabase db=helper.getWritableDatabase();
        String select="select * from USER where STU_NUM="+edit1.getText()+" and PASSWORD="+edit2.getText()+"";
        Log.i("Database:","createDB="+select);
        Cursor cursor=db.rawQuery(select,null);
        StringBuilder s = new StringBuilder();
        int i=0;
        while(cursor.moveToNext())
            {
                s.append(cursor.getInt(cursor.getColumnIndex("STU_NUM")));
                s.append(cursor.getInt(cursor.getColumnIndex("PASSWORD")));
                i++;
            }
        if(i!=0) {
            Intent intent1=new Intent();
            Bundle bundle1=new Bundle();
            bundle1.putString("STU_NUM",edit1.getText().toString());
            bundle1.putString("PASSWORD",edit2.getText().toString());
            intent1.putExtras(bundle1);
            intent1.setClass(MainActivity.this, Activity2.class);
            startActivity(intent1);

        }
        else {
            txt1.setText("用户名或密码错误！");
        }
    }
}