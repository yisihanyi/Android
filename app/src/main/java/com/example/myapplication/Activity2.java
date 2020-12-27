package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle bundle1 = this.getIntent().getExtras();
        final String STU_NUM=bundle1.getString("STU_NUM");
        final String PASSWORD=bundle1.getString("PASSWORD");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Button button1 =(Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent();
                Bundle bundle1=new Bundle();
                bundle1.putString("STU_NUM",STU_NUM);
                bundle1.putString("PASSWORD",PASSWORD);
                intent1.putExtras(bundle1);
                intent1.setClass(Activity2.this, First.class);
                startActivity(intent1);
            }
        });
        Button button2 =(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent();
                Bundle bundle1=new Bundle();
                bundle1.putString("STU_NUM",STU_NUM);
                bundle1.putString("PASSWORD",PASSWORD);
                intent1.putExtras(bundle1);
                intent1.setClass(Activity2.this,Second.class);
                startActivity(intent1);
            }
        });
        Button button4 =(Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Activity2.this,MainActivity.class);
                startActivity(intent);
            }
        });

        Button button5 =(Button)findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent();
                Bundle bundle1=new Bundle();
                bundle1.putString("STU_NUM",STU_NUM);
                intent1.putExtras(bundle1);
                intent1.setClass(Activity2.this,mine.class);
                startActivity(intent1);
            }
        });
    }
}