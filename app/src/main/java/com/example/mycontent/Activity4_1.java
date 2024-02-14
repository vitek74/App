package com.example.mycontent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import androidx.core.text.HtmlCompat;
import android.widget.Button;
import android.view.View;
import android.content.Intent;



public class Activity4_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4_1);

        // Получите текст с HTML-тегами из ресурсов
        String largeTextWithRecipe = getString(R.string.your_large_text_with_recipe);

        // Найдите TextView в вашем макете
        TextView recipeTextView = findViewById(R.id.recipeTextView);

        // Установите отформатированный текст в TextView
        recipeTextView.setText(HtmlCompat.fromHtml(largeTextWithRecipe, HtmlCompat.FROM_HTML_MODE_LEGACY));

        // Находим кнопку "Домой"
        Button buttonHome = findViewById(R.id.buttonHome1);

        // Устанавливаем слушатель кликов
        buttonHome.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // Создаем Intent для перехода на главную страницу (Activity4)
                Intent intent = new Intent(Activity4_1.this, Activity4.class);

                // Делаем главную страницу активностью по умолчанию
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                // Запускаем Intent
                startActivity(intent);
            }
        });


    }
}


