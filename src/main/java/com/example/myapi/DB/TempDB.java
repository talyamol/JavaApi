package com.example.myapi.DB;

import com.example.myapi.entities.Doctor;

import java.util.ArrayList;
import java.util.List;

public class TempDB {
    public static List<Doctor> doctors=new ArrayList<>();
    static {
        doctors.add(new Doctor(1,"omri","family dpctor"));
        doctors.add(new Doctor(2,"aviva","family dpctor"));
        doctors.add(new Doctor(3,"chaim","children dpctor"));

    }
}
