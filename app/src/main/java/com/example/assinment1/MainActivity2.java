package com.example.assinment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
public String name,reg,dept,sect;
TextView v1,v2,v3,v4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        v1=(TextView) findViewById(R.id.tv1);
        v2= (TextView) findViewById(R.id.tv2);
        v3= (TextView) findViewById(R.id.tv3);
        v4= (TextView) findViewById(R.id.tv4);
        Intent i=getIntent();
        name=i.getStringExtra("name_key");
        reg=i.getStringExtra("reg_key");
        dept=i.getStringExtra("dept_key");
        sect=i.getStringExtra("sec_key");
        v1.setText(name);
        v2.setText(reg);
        v3.setText(dept);
        v4.setText(sect);
    }
}