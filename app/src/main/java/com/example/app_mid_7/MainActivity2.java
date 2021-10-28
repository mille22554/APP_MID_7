package com.example.app_mid_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        GlobalVariable gv=(GlobalVariable) getApplicationContext();
        EditText edn=findViewById(R.id.editTextTextPersonName2);
        edn.setText(gv.getet());
    }
    public void but_click(View view){
        GlobalVariable gv=(GlobalVariable) getApplicationContext();
        Intent intent = new Intent();
        EditText edn=findViewById(R.id.editTextTextPersonName2);
        gv.setEt(edn.getText().toString());
        intent.setClass(MainActivity2.this, MainActivity.class);
        startActivity(intent);
    }
}