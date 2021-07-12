package com.example.projectclass;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    Button Print;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.Name);
        Print = findViewById(R.id.Print);
        Print.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Project obj = new Project();
                editText.setText(""+obj.elevatorPitch("waheed","sgtewrty"));


            }
        });

    }


}