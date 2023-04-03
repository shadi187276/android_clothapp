package com.example.assinment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public Spinner s1;
EditText e1,e2,e3;
public String []arr={"CS","IT","SCE"};
public String dept,name,reg,sec;
 Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1=(Spinner)  findViewById(R.id.dep_dropdown);
        e1=(EditText)findViewById(R.id.name_et  );
        e2=(EditText)findViewById(R.id.reg_et  );
        e3=(EditText)findViewById(R.id.ed_section) ;
        ArrayAdapter arrayAdapter=new ArrayAdapter(MainActivity.this, android.R.layout.simple_spinner_item,arr);
        s1.setAdapter(arrayAdapter);
        b1=(Button) findViewById(R.id.submit_btn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                name=e1.getText().toString();
                reg=e2.getText().toString();
                dept=s1.getSelectedItem().toString();
                sec=e3.getText().toString();
                i.putExtra("name_key", name);
                i.putExtra("reg_key",reg);
                i.putExtra("dept_key", dept);
                i.putExtra("sec_key",sec);
                startActivity(i);

            }
        });

    }



}