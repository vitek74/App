//Мясо

package com.example.mycontent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Activity4_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4_3);

        // Переход к Activity4_3_1
        Button buttonActivity4_3_1 = findViewById(R.id.buttonActivity4_3_1);
        buttonActivity4_3_1.setOnClickListener(view -> {
            Intent intent = new Intent(Activity4_3.this, Activity4_3_1.class);
            startActivity(intent);
        });

        // Переход к Activity4_3_2
        Button buttonActivity4_3_2 = findViewById(R.id.buttonActivity4_3_2);
        buttonActivity4_3_2.setOnClickListener(view -> {
            Intent intent = new Intent(Activity4_3.this, Activity4_3_2.class);
            startActivity(intent);
        });


    }
}