package com.example.mycontent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Переход к Activity2
        Button buttonActivity2 = findViewById(R.id.buttonActivity2);
        buttonActivity2.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Activity2.class);
            startActivity(intent);
        });

        // Переход к Activity3
        Button buttonActivity3 = findViewById(R.id.buttonActivity3);
        buttonActivity3.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Activity3.class);
            startActivity(intent);
        });

        // Переход к Activity4
        Button buttonActivity4 = findViewById(R.id.buttonActivity4);
        buttonActivity4.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Activity4.class);
            startActivity(intent);
        });

        // Переход к Activity5
        Button buttonActivity5 = findViewById(R.id.buttonActivity5);
        buttonActivity5.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Activity5.class);
            startActivity(intent);
        });


    }
}
