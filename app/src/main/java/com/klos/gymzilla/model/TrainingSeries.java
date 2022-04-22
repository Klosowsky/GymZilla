package com.klos.gymzilla.model;

import com.klos.gymzilla.MainActivity;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class TrainingSeries {
    private int seriesId;
    private int userId;
    private int excerciseId;
    private int workoutId;
    private int[] sets;

    public TrainingSeries(int seriesId, int userId, int excerciseId, int workoutId, int[] sets, String comment) {
        this.seriesId = seriesId;
        this.userId = userId;
        this.excerciseId = excerciseId;
        this.workoutId = workoutId;
        this.sets = sets;
        this.comment = comment;
    }

    public static void createSeriesList(){
        ArrayList<TrainingSeries> seriesList = new ArrayList<>();
            try{
                if(MainActivity.connect!=null) {
                    String sqlQuery = "Select * from trainingSeries";
                    Statement statement = MainActivity.connect.createStatement();
                    ResultSet rs = statement.executeQuery(sqlQuery);
                    while(rs.next()){
                        //seriesList.add(new TrainingSeries(rs.getString))
                    }
                }
            }catch(Exception ex){

            }




    }

    public int getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(int seriesId) {
        this.seriesId = seriesId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getExcerciseId() {
        return excerciseId;
    }

    public void setExcerciseId(int excerciseId) {
        this.excerciseId = excerciseId;
    }

    public int getWorkoutId() {
        return workoutId;
    }

    public void setWorkoutId(int workoutId) {
        this.workoutId = workoutId;
    }

    public int[] getSets() {
        return sets;
    }

    public void setSets(int[] sets) {
        this.sets = sets;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    private String comment;


}
