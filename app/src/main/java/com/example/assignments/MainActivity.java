package com.example.assignments;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button expandableListview, recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        expandableListview = findViewById(R.id.btn_expandable_listview);
        recycler = findViewById(R.id.recyclerViewActivity);


        expandableListview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ExpandableListActivity.class);


                startActivity(intent);
            }
        });
        recycler.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), RecyclerViewActivity.class)));


    }
}