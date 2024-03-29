//Рыба посол в рассоле

package com.example.mycontent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import androidx.core.text.HtmlCompat;



public class Activity4_2_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4_2_2);

        // Получите текст с HTML-тегами из ресурсов
        String largeTextWithRecipe = getString(R.string.your_large_text_with_recipe_4_2_2);

        // Найдите TextView в вашем макете
        TextView recipeTextView = findViewById(R.id.recipeTextView);

        // Установите отформатированный текст в TextView
        recipeTextView.setText(HtmlCompat.fromHtml(largeTextWithRecipe, HtmlCompat.FROM_HTML_MODE_LEGACY));
    }
}