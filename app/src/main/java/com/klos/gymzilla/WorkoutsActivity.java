package com.klos.gymzilla;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.klos.gymzilla.adapter.WorkoutAdapter;
import com.klos.gymzilla.model.Workout;

import java.util.ArrayList;
import java.util.List;

public class WorkoutsActivity extends AppCompatActivity {
    ArrayList<Workout> workoutList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workouts);
        RecyclerView rvContacts = (RecyclerView) findViewById(R.id.reclycerView_workouts_list);

        workoutList = Workout.createContactsList(20);
        // Create adapter passing in the sample user data
        WorkoutAdapter adapter = new WorkoutAdapter(workoutList);
        // Attach the adapter to the recyclerview to populate items
        rvContacts.setAdapter(adapter);
        // Set layout manager to position the items
        rvContacts.setLayoutManager(new LinearLayoutManager(this));
    }

    {

    }



    //RecyclerView recyclerView = (RecyclerView)findViewById(R.id.reclycerView_workouts_list);
    //recyclerView;



}