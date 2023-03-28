package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b ;

    EditText text;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b= findViewById(R.id.name);
        text =findViewById(R.id.button)   ;

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String  s = text.getText().toString();
                Intent intent = new Intent(getApplicationContext(), secondActivity.class);
                intent.putExtra("name",s);
                startActivity(intent);



            }
        });

    }
}