package com.ptk.myapplication3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvLanguage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvLanguage = findViewById(R.id.rvLanguage);

        ArrayList<String> language = new ArrayList<>();
        language.add("Kotlin");
        language.add("Java");
        language.add("PHP");
        language.add("Swift");
        language.add("C");
        language.add("C++");
        language.add("C#");
        language.add("Dart");
        language.add("JavaScript");
        language.add("Python");
        language.add("Kotlin");
        language.add("Java");
        language.add("PHP");
        language.add("Swift");
        language.add("C");
        language.add("C++");
        language.add("C#");
        language.add("Dart");
        language.add("JavaScript");
        language.add("Python");
        language.add("Kotlin");
        language.add("Java");
        language.add("PHP");
        language.add("Swift");
        language.add("C");
        language.add("C++");
        language.add("C#");
        language.add("Dart");
        language.add("JavaScript");
        language.add("Python");
        language.add("Kotlin");
        language.add("Java");
        language.add("PHP");
        language.add("Swift");
        language.add("C");
        language.add("C++");
        language.add("C#");
        language.add("Dart");
        language.add("JavaScript");
        language.add("Python");

        LanguageAdapter adapter = new LanguageAdapter(language);

        LinearLayoutManager llManager = new LinearLayoutManager(this);
        DividerItemDecoration decoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        decoration.setDrawable(getResources().getDrawable(R.drawable.custom_divider));
        rvLanguage.addItemDecoration(decoration);

        rvLanguage.setLayoutManager(llManager);
        rvLanguage.setAdapter(adapter);

    }
}