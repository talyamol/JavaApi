package com.example.myapi.controllers;

import com.example.myapi.DB.TempDB;
import com.example.myapi.entities.Doctor;
import com.example.myapi.repositories.DoctorRepository;
import com.example.myapi.services.DocrotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    DocrotService doctorServise;
    @GetMapping
    public List<Doctor> getDoctors(){
        return doctorServise.getDoctors();
    }
    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable int id){
        return doctorServise.getDoctorById(id);
    }
    @PostMapping
    public void postDoctor(@RequestBody Doctor doctor){
     doctorServise.postDoctor(doctor);
    }

    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable int id){
       doctorServise.deleteDoctor(id);
    }

    @PutMapping("/{id}")
    public void updateDoctor(@PathVariable int id, @RequestBody Doctor doctor){
        doctorServise.updateDoctor(id,doctor);
    }
}
