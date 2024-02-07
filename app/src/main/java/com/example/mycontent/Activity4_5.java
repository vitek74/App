//Рыба копчение

package com.example.mycontent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Activity4_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4_5);

        // Переход к Activity4_5_1
        Button buttonActivity4_5_1 = findViewById(R.id.buttonActivity4_5_1);
        buttonActivity4_5_1.setOnClickListener(view -> {
            Intent intent = new Intent(Activity4_5.this, Activity4_5_1.class);
            startActivity(intent);
        });

        // Переход к Activity4_5_2
        Button buttonActivity4_5_2 = findViewById(R.id.buttonActivity4_5_2);
        buttonActivity4_5_2.setOnClickListener(view -> {
            Intent intent = new Intent(Activity4_5.this, Activity4_5_2.class);
            startActivity(intent);
        });

    }
}