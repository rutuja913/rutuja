package com.example.cardview.cardviewy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardview.R;

import java.util.ArrayList;

public class CardViewActivity extends AppCompatActivity {
private RecyclerView recyclerView;
private CardAdapter adapter;
private ArrayList<StudentCards> studentsArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);
        intializeCardView();
    }

    private void intializeCardView() {
        recyclerView=findViewById(R.id.recyclerViewCardy);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        studentsArrayList=new ArrayList<>();
        adapter=new CardAdapter(this,studentsArrayList);
        recyclerView.setAdapter(adapter);
        createDataForCards();
    }

    private void createDataForCards() {
        StudentCards student=new StudentCards("rutuja",15,22,"sonirutuja28@gmail.com");
        studentsArrayList.add(student);
        student=new StudentCards("yash",15,22,"soniyash28@gmail.com");
        studentsArrayList.add(student);
        student=new StudentCards("shreya",15,22,"sonishreya28@gmail.com");
        studentsArrayList.add(student);
        student=new StudentCards("nisha",15,22,"soninisha28@gmail.com");
        studentsArrayList.add(student);
        student=new StudentCards("palak",15,22,"sonipalak28@gmail.com");
        studentsArrayList.add(student);
        student=new StudentCards("pranjal",15,22,"sonipranjal28@gmail.com");
        studentsArrayList.add(student);
        student=new StudentCards("aarush",15,22,"soniaarush28@gmail.com");
        studentsArrayList.add(student);
        student=new StudentCards("mitu",15,22,"sonimitu28@gmail.com");
        studentsArrayList.add(student);
        student=new StudentCards("shorya",15,22,"sonishorya28@gmail.com");
        studentsArrayList.add(student);
        student=new StudentCards("trupti",15,22,"sonitrupti28@gmail.com");
        studentsArrayList.add(student);
        adapter.notifyDataSetChanged();
    }
}