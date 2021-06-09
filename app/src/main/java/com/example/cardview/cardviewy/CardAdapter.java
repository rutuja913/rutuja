package com.example.cardview.cardviewy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardview.R;

import java.util.ArrayList;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.StudentHolder2> {
    private Context context2;
    private ArrayList<StudentCards> students;

    public CardAdapter(Context context2, ArrayList<StudentCards> students) {
        this.context2 = context2;
        this.students = students;
    }

    @NonNull
    @Override
    public StudentHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context2).inflate(R.layout.item_card, parent, false);
        return new StudentHolder2(view);

    }

    @Override
    public void onBindViewHolder(@NonNull StudentHolder2 holder, int position) {
        StudentCards student = students.get(position);
        holder.setDetails(student);
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    class StudentHolder2 extends RecyclerView.ViewHolder {
        private TextView name, class1, age, email;

        StudentHolder2(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            class1 = itemView.findViewById(R.id.class1);
            age = itemView.findViewById(R.id.age);
            email = itemView.findViewById(R.id.email);


        }

        void setDetails(StudentCards student) {
            name.setText(student.getName());
            class1.setText(student.getClass1());
            age.setText(student.getAge());
            email.setText(student.getEmail());


        }

    }
}
