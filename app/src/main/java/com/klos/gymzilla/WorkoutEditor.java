package com.klos.gymzilla;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class WorkoutEditor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_editor);

        TextView workoutEdit= (TextView) findViewById(R.id.workout_editor);


    }
}