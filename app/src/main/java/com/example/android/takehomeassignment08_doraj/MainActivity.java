package com.example.android.takehomeassignment08_doraj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Project> projects;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ProjectsAdapter(projects, this));
    }

    private void initialData(){
        projects = new ArrayList<>();
        projects.add(new Project(R.string.counter_top_name,R.string.level_a1, R.string.counter_top_time, R.drawable.countertop));
        projects.add(new Project(R.string.ispring_name, R.string.level_i3, R.string.ispring_time, R.drawable.ispringwaterfilter));
        projects.add(new Project(R.string.smart_bidet_name, R.string.level_i1, R.string.smart_bidet_time, R.drawable.smartbidet));
        projects.add(new Project(R.string.screen_iphone_name, R.string.level_b2, R.string.screen_iphone_time, R.drawable.screeniphone));
        projects.add(new Project(R.string.drying_rack_name, R.string.level_m1, R.string.drying_rack_time, R.drawable.dryingrack));
        projects.add(new Project(R.string.pencil_box_name, R.string.level_b1, R.string.pencil_box_time, R.drawable.pencilbox));
    }
}
