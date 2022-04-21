package com.klos.gymzilla;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.reclycerView_workouts_list);

        workoutList = Workout.createContactsList();
        WorkoutAdapter adapter = new WorkoutAdapter(workoutList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void editWorkout(View v){

        Intent intent = new Intent(this,WorkoutEditor.class);
        startActivity(intent);
        System.out.println(WorkoutAdapter.buttonControler);

    }

}