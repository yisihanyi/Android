package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Second extends AppCompatActivity {
    private TextView t201;
    private TextView t202;
    private TextView t203;
    private TextView t204;
    private TextView t205;
    private TextView t206;
    private TextView t207;
    private TextView t208;
    private TextView t209;
    private TextView t210;
    private TextView txt;
    private DatabaseHelper helper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle bundle1 = this.getIntent().getExtras();
        final String STU_NUM=bundle1.getString("STU_NUM");
        super.onCreate(savedInstanceState);
        helper=new DatabaseHelper(this,"Database",null,2);
        setContentView(R.layout.activity_second);
        txt=(TextView)findViewById(R.id.textView);

        t201=(TextView)findViewById(R.id.t201);
        SQLiteDatabase db1=helper.getWritableDatabase();
        String select1 = "select STATE from SEAT where SEAT_NUM="+"'t201'"+" ";
        Log.i("Database", "createDB=" + select1);
        Cursor cursor1 = db1.rawQuery(select1,null);
        StringBuilder s1 = new StringBuilder();
        while(cursor1.moveToNext()){
            s1.append(""+cursor1.getString(cursor1.getColumnIndex("STATE"))+"\n");
        }
        t201.setText(s1.toString());

        t202=(TextView)findViewById(R.id.t202);
        SQLiteDatabase db=helper.getWritableDatabase();
        String select2 = "select STATE from SEAT where SEAT_NUM="+"'t202'"+" ";
        Log.i("Database", "createDB=" + select2);
        Cursor cursor2 = db.rawQuery(select2,null);
        StringBuilder s2 = new StringBuilder();
        while(cursor2.moveToNext()){
            s2.append(""+cursor2.getString(cursor2.getColumnIndex("STATE"))+"\n");
        }
        t202.setText(s2.toString());

        t203=(TextView)findViewById(R.id.t203);
        SQLiteDatabase db3=helper.getWritableDatabase();
        String select3 = "select STATE from SEAT where SEAT_NUM="+"'t203'"+" ";
        Log.i("Database", "createDB=" + select3);
        Cursor cursor3 = db3.rawQuery(select3,null);
        StringBuilder s3 = new StringBuilder();
        while(cursor3.moveToNext()){
            s3.append(""+cursor3.getString(cursor3.getColumnIndex("STATE"))+"\n");
        }
        t203.setText(s3.toString());

        t204=(TextView)findViewById(R.id.t204);
        SQLiteDatabase db4=helper.getWritableDatabase();
        String select4 = "select STATE from SEAT where SEAT_NUM="+"'t204'"+" ";
        Log.i("Database", "createDB=" + select4);
        Cursor cursor4 = db4.rawQuery(select4,null);
        StringBuilder s4 = new StringBuilder();
        while(cursor4.moveToNext()){
            s4.append(""+cursor4.getString(cursor4.getColumnIndex("STATE"))+"\n");
        }
        t204.setText(s4.toString());

        t205=(TextView)findViewById(R.id.t205);
        SQLiteDatabase db5=helper.getWritableDatabase();
        String select5 = "select STATE from SEAT where SEAT_NUM="+"'t205'"+" ";
        Log.i("Database", "createDB=" + select5);
        Cursor cursor5 = db5.rawQuery(select5,null);
        StringBuilder s5 = new StringBuilder();
        while(cursor5.moveToNext()){
            s5.append(""+cursor5.getString(cursor5.getColumnIndex("STATE"))+"\n");
        }
        t205.setText(s5.toString());

        t206=(TextView)findViewById(R.id.t206);
        SQLiteDatabase db6=helper.getWritableDatabase();
        String select6 = "select STATE from SEAT where SEAT_NUM="+"'t206'"+" ";
        Log.i("Database", "createDB=" + select6);
        Cursor cursor6 = db6.rawQuery(select6,null);
        StringBuilder s6 = new StringBuilder();
        while(cursor6.moveToNext()){
            s6.append(""+cursor6.getString(cursor6.getColumnIndex("STATE"))+"\n");
        }
        t206.setText(s6.toString());

        t207=(TextView)findViewById(R.id.t207);
        SQLiteDatabase db7=helper.getWritableDatabase();
        String select7 = "select STATE from SEAT where SEAT_NUM="+"'t207'"+" ";
        Log.i("Database", "createDB=" + select7);
        Cursor cursor7 = db7.rawQuery(select7,null);
        StringBuilder s7 = new StringBuilder();
        while(cursor7.moveToNext()){
            s7.append(""+cursor7.getString(cursor7.getColumnIndex("STATE"))+"\n");
        }
        t207.setText(s7.toString());

        t208=(TextView)findViewById(R.id.t208);
        SQLiteDatabase db8=helper.getWritableDatabase();
        String select8 = "select STATE from SEAT where SEAT_NUM="+"'t208'"+" ";
        Log.i("Database", "createDB=" + select8);
        Cursor cursor8 = db8.rawQuery(select8,null);
        StringBuilder s8 = new StringBuilder();
        while(cursor8.moveToNext()){
            s8.append(""+cursor8.getString(cursor8.getColumnIndex("STATE"))+"\n");
        }
        t208.setText(s8.toString());

        t209=(TextView)findViewById(R.id.t209);
        SQLiteDatabase db9=helper.getWritableDatabase();
        String select9 = "select STATE from SEAT where SEAT_NUM="+"'t209'"+" ";
        Log.i("Database", "createDB=" + select9);
        Cursor cursor9 = db9.rawQuery(select9,null);
        StringBuilder s9 = new StringBuilder();
        while(cursor9.moveToNext()){
            s9.append(""+cursor9.getString(cursor9.getColumnIndex("STATE"))+"\n");
        }
        t209.setText(s9.toString());

        t210=(TextView)findViewById(R.id.t210);
        SQLiteDatabase db10=helper.getWritableDatabase();
        String select10 = "select STATE from SEAT where SEAT_NUM="+"'t210'"+" ";
        Log.i("Database", "createDB=" + select10);
        Cursor cursor10 = db10.rawQuery(select10,null);
        StringBuilder s10 = new StringBuilder();
        while(cursor10.moveToNext()){
            s10.append(""+cursor10.getString(cursor10.getColumnIndex("STATE"))+"\n");
        }
        t210.setText(s10.toString());

        Button b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db=helper.getWritableDatabase();
                String update1="update CHOOSE set SEAT_NUM="+"'t201'"+" where STU_NUM="+STU_NUM+"";
                Log.i("Database", "createDB=" + update1);
                db.execSQL(update1);
                String update2="update SEAT set STATE="+"'已选'"+" where SEAT_NUM="+"'t201'"+"";
                Log.i("Database", "createDB=" + update2);
                db.execSQL(update2);
                txt.setText("选座成功！");
            }
        });

        Button b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db=helper.getWritableDatabase();
                String update1="update CHOOSE set SEAT_NUM="+"'t202'"+" where STU_NUM="+STU_NUM+"";
                Log.i("Database", "createDB=" + update1);
                db.execSQL(update1);
                String update2="update SEAT set STATE="+"'已选'"+" where SEAT_NUM="+"'t202'"+"";
                Log.i("Database", "createDB=" + update2);
                db.execSQL(update2);
                txt.setText("选座成功！");
            }
        });

        Button b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db=helper.getWritableDatabase();
                String update1="update CHOOSE set SEAT_NUM="+"'t203'"+" where STU_NUM="+STU_NUM+"";
                Log.i("Database", "createDB=" + update1);
                db.execSQL(update1);
                String update2="update SEAT set STATE="+"'已选'"+" where SEAT_NUM="+"'t203'"+"";
                Log.i("Database", "createDB=" + update2);
                db.execSQL(update2);
                txt.setText("选座成功！");
            }
        });

        Button b4 = (Button) findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db=helper.getWritableDatabase();
                String update1="update CHOOSE set SEAT_NUM="+"'t204'"+" where STU_NUM="+STU_NUM+"";
                Log.i("Database", "createDB=" + update1);
                db.execSQL(update1);
                String update2="update SEAT set STATE="+"'已选'"+" where SEAT_NUM="+"'t204'"+"";
                Log.i("Database", "createDB=" + update2);
                db.execSQL(update2);
                txt.setText("选座成功！");
            }
        });

        Button b5 = (Button) findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db=helper.getWritableDatabase();
                String update1="update CHOOSE set SEAT_NUM="+"'t205'"+" where STU_NUM="+STU_NUM+"";
                Log.i("Database", "createDB=" + update1);
                db.execSQL(update1);
                String update2="update SEAT set STATE="+"'已选'"+" where SEAT_NUM="+"'t205'"+"";
                Log.i("Database", "createDB=" + update2);
                db.execSQL(update2);
                txt.setText("选座成功！");
            }
        });

        Button b6 = (Button) findViewById(R.id.b6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db=helper.getWritableDatabase();
                String update1="update CHOOSE set SEAT_NUM="+"'t206'"+" where STU_NUM="+STU_NUM+"";
                Log.i("Database", "createDB=" + update1);
                db.execSQL(update1);
                String update2="update SEAT set STATE="+"'已选'"+" where SEAT_NUM="+"'t206'"+"";
                Log.i("Database", "createDB=" + update2);
                db.execSQL(update2);
                txt.setText("选座成功！");
            }
        });

        Button b7 = (Button) findViewById(R.id.b7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db=helper.getWritableDatabase();
                String update1="update CHOOSE set SEAT_NUM="+"'t207'"+" where STU_NUM="+STU_NUM+"";
                Log.i("Database", "createDB=" + update1);
                db.execSQL(update1);
                String update2="update SEAT set STATE="+"'已选'"+" where SEAT_NUM="+"'t207'"+"";
                Log.i("Database", "createDB=" + update2);
                db.execSQL(update2);
                txt.setText("选座成功！");
            }
        });

        Button b8 = (Button) findViewById(R.id.b8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db=helper.getWritableDatabase();
                String update1="update CHOOSE set SEAT_NUM="+"'t208'"+" where STU_NUM="+STU_NUM+"";
                Log.i("Database", "createDB=" + update1);
                db.execSQL(update1);
                String update2="update SEAT set STATE="+"'已选'"+" where SEAT_NUM="+"'t208'"+"";
                Log.i("Database", "createDB=" + update2);
                db.execSQL(update2);
                txt.setText("选座成功！");
            }
        });

        Button b9 = (Button) findViewById(R.id.b9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db=helper.getWritableDatabase();
                String update1="update CHOOSE set SEAT_NUM="+"'t209'"+" where STU_NUM="+STU_NUM+"";
                Log.i("Database", "createDB=" + update1);
                db.execSQL(update1);
                String update2="update SEAT set STATE="+"'已选'"+" where SEAT_NUM="+"'t209'"+"";
                Log.i("Database", "createDB=" + update2);
                db.execSQL(update2);
                txt.setText("选座成功！");
            }
        });

        Button b10 = (Button) findViewById(R.id.b10);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db=helper.getWritableDatabase();
                String update1="update CHOOSE set SEAT_NUM="+"'t210'"+" where STU_NUM="+STU_NUM+"";
                Log.i("Database", "createDB=" + update1);
                db.execSQL(update1);
                String update2="update SEAT set STATE="+"'已选'"+" where SEAT_NUM="+"'t210'"+"";
                Log.i("Database", "createDB=" + update2);
                db.execSQL(update2);
                txt.setText("选座成功！");
            }
        });
    }
}