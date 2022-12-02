package com.ParthSpringDemo;

public class Doctor {
    String name;

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    Nurse nurse;
    public Doctor() {
        System.out.println("doctor object created");
    }

    public void setName(String name) {
    this.name = name;
    }
}
