package com.klos.gymzilla.model;

import java.util.ArrayList;

public class Workout {
    private String workoutName;
    private int workoutId;


    public Workout(String workoutName){
        this.workoutName=workoutName;
    }
    public String getWorkoutName(){
        return workoutName;
    }

    private static int lastContactId = 0;

    public static ArrayList<Workout> createContactsList(int numContacts) {
        ArrayList<Workout> contacts = new ArrayList<Workout>();

        for (int i = 1; i <= numContacts; i++) {
            contacts.add(new Workout("Person " + ++lastContactId));
        }

        return contacts;
    }
}
