package com.example.assignments;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recycler_view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        String[] title = getResources().getStringArray(R.array.planets_array);
        String[] subtitle ={
                "Sub Title 1","Sub Title 2",
                "Sub Title 3","Sub Title 4",
                "Sub Title 5", "Sub Title 6",
                "Sub Title 7",
                "Sub Title 8","Sub Title 9",
                "Sub Title 10",
        };
        Integer[] imgid = {R.drawable.mercury,R.drawable.venus,R.drawable.earth,R.drawable.mars,R.drawable.jupiter,R.drawable.saturn,R.drawable.uranas,R.drawable.neptune,R.drawable.pluto,R.drawable.exoplanet};

        ArrayList<Model> data = new ArrayList<>();

        for (int i = 0; i<title.length; i++){
            Model obj = new Model();
            obj.setTitle(title[i]);
            obj.setSubtitle(subtitle[i]);
            obj.setImageId(imgid[i]);
            data.add(obj);
        }

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(data, getApplicationContext());

        recyclerView.setAdapter(adapter);
    }
}