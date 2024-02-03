package com.example.mycontent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4);

        // Переход к Activity4_1
        Button buttonActivity4_1 = findViewById(R.id.buttonActivity4_1);
        buttonActivity4_1.setOnClickListener(view -> {
            Intent intent = new Intent(Activity4.this, Activity4_1.class);
            startActivity(intent);
        });

        // Переход к Activity4_2
        Button buttonActivity4_2 = findViewById(R.id.buttonActivity4_2);
        buttonActivity4_2.setOnClickListener(view -> {
            Intent intent = new Intent(Activity4.this, Activity4_2.class);
            startActivity(intent);
        });

        // Переход к Activity4_3
        Button buttonActivity4_3 = findViewById(R.id.buttonActivity4_3);
        buttonActivity4_3.setOnClickListener(view -> {
            Intent intent = new Intent(Activity4.this, Activity4_3.class);
            startActivity(intent);
        });

        // Переход к Activity4_4
        Button buttonActivity4_4 = findViewById(R.id.buttonActivity4_4);
        buttonActivity4_4.setOnClickListener(view -> {
            Intent intent = new Intent(Activity4.this, Activity4_4.class);
            startActivity(intent);
        });
    }
}

