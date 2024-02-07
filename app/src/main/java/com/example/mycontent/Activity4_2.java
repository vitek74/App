//Рыба

package com.example.mycontent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Activity4_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4_2);

        // Переход к Activity4_2_1
        Button buttonActivity4_2_1 = findViewById(R.id.buttonActivity4_2_1);
        buttonActivity4_2_1.setOnClickListener(view -> {
            Intent intent = new Intent(Activity4_2.this, Activity4_2_1.class);
            startActivity(intent);
        });

        // Переход к Activity4_2_2
        Button buttonActivity4_2_2 = findViewById(R.id.buttonActivity4_2_2);
        buttonActivity4_2_2.setOnClickListener(view -> {
            Intent intent = new Intent(Activity4_2.this, Activity4_2_2.class);
            startActivity(intent);
        });


    }
}
