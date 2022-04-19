package com.klos.gymzilla.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.klos.gymzilla.R;
import com.klos.gymzilla.model.Workout;

import java.util.List;

public class WorkoutAdapter extends RecyclerView.Adapter<WorkoutAdapter.ViewHolder> {
    private List<Workout> mContacts;

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.item_workout, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull WorkoutAdapter.ViewHolder holder, int position) {
        Workout workout = mContacts.get(position);

        // Set item views based on your views and data model
        TextView textView = holder.nameTextView;
        textView.setText(workout.getWorkoutName());
        Button button = holder.messageButton;
        button.setText("Edit");
        button.setEnabled(true);
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView nameTextView;
        public Button messageButton;
        public ViewHolder(View itemView){
            super(itemView);
            nameTextView = (TextView) itemView.findViewById(R.id.workout_name);
            messageButton = (Button) itemView.findViewById(R.id.edit_button);
        }
    }

    // Pass in the contact array into the constructor
    public WorkoutAdapter(List<Workout> contacts) {
        mContacts = contacts;
    }
}
