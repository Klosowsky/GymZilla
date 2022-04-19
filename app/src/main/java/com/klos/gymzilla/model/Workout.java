package com.klos.gymzilla.model;

import java.util.ArrayList;

public class Workout {
    private String workoutName;
    private int workoutId;

    public Workout(int workoutId, String workoutName){
        this.workoutName=workoutName;
        this.workoutId=workoutId;
    }

    public String getWorkoutName(){
        return workoutName;
    }

    public static ArrayList<Workout> createContactsList() {
        ArrayList<Workout> workouts = new ArrayList<Workout>();


        return workouts;
    }
}
