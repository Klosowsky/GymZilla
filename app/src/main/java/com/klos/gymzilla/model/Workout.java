package com.klos.gymzilla.model;

import android.util.Log;

import com.klos.gymzilla.MainActivity;
import com.klos.gymzilla.connection.ConnectionHelper;

import net.sourceforge.jtds.jdbc.DateTime;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

public class Workout {
    private String workoutName;
    private int workoutId;
    private Date workoutDate;

    public Workout(int workoutId, String workoutName, Date workoutDate){
        this.workoutName=workoutName;
        this.workoutId=workoutId;
        this.workoutDate=workoutDate;
    }



    public int getWorkoutId(){
        return workoutId;
    }

    public Date getWorkoutDate(){
        return workoutDate;
    }

    public String getWorkoutName(){
        return workoutName;
    }

    public static ArrayList<Workout> createContactsList() {
        ArrayList<Workout> workouts = new ArrayList<Workout>();
        try {
            String sqlQuery = "Select * from workouts1";
            if (MainActivity.connect != null) {
                Statement statement = MainActivity.connect.createStatement();
                ResultSet rs = statement.executeQuery(sqlQuery);
                while(rs.next()) {
                   workouts.add(new Workout(rs.getInt(1), rs.getString(2), rs.getDate(3)));
                }

            } else {
                Log.e("Error: ", "");
            }
        }catch(Exception ex){
            Log.e("Error: ", ex.getMessage());

        }

        return workouts;
    }
}
