package com.example.quizkro;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class categories_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories_activity);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String i = "Categories";
        Objects.requireNonNull(getSupportActionBar()).setTitle(i);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        RecyclerView recyclerView = findViewById(R.id.rv);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        final List<CategoryModel> list = new ArrayList<>();
        list.add(new CategoryModel("", "category1"));
        list.add(new CategoryModel("", "category1"));
        list.add(new CategoryModel("", "category1"));
        list.add(new CategoryModel("", "category1"));
        list.add(new CategoryModel("", "category1"));
        list.add(new CategoryModel("", "category1"));
        list.add(new CategoryModel("", "category1"));
        list.add(new CategoryModel("", "category1"));
        list.add(new CategoryModel("", "category1"));
        list.add(new CategoryModel("", "category1"));
        final category_adapter categoryAdapter = new category_adapter(list);
        recyclerView.setAdapter(categoryAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}