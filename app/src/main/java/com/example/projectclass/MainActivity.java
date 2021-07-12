package com.example.projectclass;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
Project project=new Project();
EditText editText=findViewById(R.id.Name);
EditText editText1=findViewById(R.id.description);
Button button =findViewById(R.id.Print);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



}