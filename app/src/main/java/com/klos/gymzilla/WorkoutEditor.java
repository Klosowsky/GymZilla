package com.klos.gymzilla;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class WorkoutEditor extends AppCompatActivity {
    int workoutId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_editor);
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            workoutId = extras.getInt("idValue");
        }
        TextView workoutEdit= (TextView) findViewById(R.id.workout_editor);
        workoutEdit.setTag("name");
        workoutEdit.setText("trening o id "+ workoutId);

    }
}