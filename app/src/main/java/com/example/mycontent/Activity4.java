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
    }
}
