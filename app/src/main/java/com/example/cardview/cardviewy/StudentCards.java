package com.example.cardview.cardviewy;

public class StudentCards {
    private String name;
    private int class1;
    private int age;
    private String email;
    public StudentCards(String name,int class1,int age,String email)
    {
        this.name=name;
        this.class1=class1;
        this.age=age;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public int getClass1() {
        return class1;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}
