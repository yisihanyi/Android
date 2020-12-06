package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class mine extends AppCompatActivity {
    private DatabaseHelper helper;
    private TextView txt;
    private TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle bundle1 = this.getIntent().getExtras();
        final String STU_NUM=bundle1.getString("STU_NUM");
        helper=new DatabaseHelper(this,"Database",null,2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine);
        txt1=(TextView)findViewById(R.id.textView2);

        txt=(TextView)findViewById(R.id.textView1);
        SQLiteDatabase db1=helper.getWritableDatabase();
        String select1 = "select SEAT_NUM from CHOOSE where STU_NUM="+STU_NUM+" ";
        Log.i("Database", "createDB=" + select1);
        Cursor cursor1 = db1.rawQuery(select1,null);
        final StringBuilder s1 = new StringBuilder();
        while(cursor1.moveToNext()){
            s1.append(cursor1.getString(cursor1.getColumnIndex("SEAT_NUM")));
        }
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println(s1);
        txt.setText(s1.toString());

        Button b = (Button) findViewById(R.id.button5);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db=helper.getWritableDatabase();
                String update1="update CHOOSE set SEAT_NUM="+null+" where STU_NUM="+STU_NUM+"";
                String update2="update SEAT set STATE="+"'空闲'"+" where SEAT_NUM='"+s1+"'";
                Log.i("Database", "createDB=" + update1);
                db.execSQL(update1);
                Log.i("Database", "createDB=" + update2);
                db.execSQL(update2);
                txt1.setText("取消成功！");
            }
        });
    }
}