package com.example.app_mid_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GlobalVariable gv=(GlobalVariable) getApplicationContext();
        EditText edn=findViewById(R.id.editTextTextPersonName);
        edn.setText(gv.getet());
    }
    public void but_click(View view){
        GlobalVariable gv=(GlobalVariable) getApplicationContext();
        Intent intent = new Intent();
        EditText edn=findViewById(R.id.editTextTextPersonName);
        gv.setEt(edn.getText().toString());
        intent.setClass(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }
}