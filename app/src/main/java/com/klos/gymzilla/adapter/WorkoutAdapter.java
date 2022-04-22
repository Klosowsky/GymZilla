package com.klos.gymzilla.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.klos.gymzilla.R;
import com.klos.gymzilla.WorkoutEditor;
import com.klos.gymzilla.model.Workout;

import java.util.List;
public class WorkoutAdapter extends RecyclerView.Adapter<WorkoutAdapter.ViewHolder> {
    private List<Workout> workouts;
    public static int buttonControler;
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
        TextView nameTV = holder.nameTextView;

        nameTV.setText(workout.getWorkoutName());
        TextView dateTV = holder.dateTextView;
        dateTV.setText(workout.getWorkoutDate().toString());
        Button button = holder.editWorkoutBtn;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(workout.getWorkoutId());
                Intent intent = new Intent(view.getContext(), WorkoutEditor.class);
                intent.putExtra("idValue",workout.getWorkoutId());
                view.getContext().startActivity(intent);

            }
        });
        button.setText("Edit");
        button.setEnabled(true);

    }




    @Override
    public int getItemCount() {
        return workouts.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView nameTextView;
        public TextView dateTextView;
        public Button editWorkoutBtn;
        public ViewHolder(View itemView){
            super(itemView);
            nameTextView = (TextView) itemView.findViewById(R.id.workout_name);
            dateTextView = (TextView) itemView.findViewById(R.id.workout_date);
            editWorkoutBtn = (Button) itemView.findViewById(R.id.edit_button);

        }
    }

    public WorkoutAdapter(List<Workout> contacts) {
        workouts = contacts;
    }
}

// dodac edycje treningu... i wypisywanie trenignów z bazy... onClickListener() do buttonów?