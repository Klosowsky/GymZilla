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
    private List<Workout> workouts;

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contactView = inflater.inflate(R.layout.item_workout, parent, false);
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull WorkoutAdapter.ViewHolder holder, int position) {
        Workout workout = workouts.get(position);
        TextView textView = holder.nameTextView;
        textView.setText(workout.getWorkoutName());
        Button button = holder.editWorkoutBtn;
        button.setText("Edit");
        button.setEnabled(true);
    }

    @Override
    public int getItemCount() {
        return workouts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView nameTextView;
        public Button editWorkoutBtn;
        public ViewHolder(View itemView){
            super(itemView);
            nameTextView = (TextView) itemView.findViewById(R.id.workout_name);
            editWorkoutBtn = (Button) itemView.findViewById(R.id.edit_button);
        }
    }

    public WorkoutAdapter(List<Workout> contacts) {
        workouts = contacts;
    }
}

// dodac edycje treningu... i wypisywanie trenignów z bazy... onClickListener() do buttonów?