package com.example.myapi.services;
import com.example.myapi.DB.TempDB;
import com.example.myapi.entities.Doctor;
import com.example.myapi.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class DocrotService {

    @Autowired
    DoctorRepository doctorRepository;
    public List<Doctor> getDoctors(){
        return (List<Doctor>) doctorRepository.findAll();
    }

    public Doctor getDoctorById( int id){
        return doctorRepository.findById(id).orElse(null);
    }
    public void postDoctor( Doctor doctor){
        doctorRepository.save(doctor);
    }

    public void deleteDoctor(int id){
      doctorRepository.deleteById(id);
    }

    public void updateDoctor( int id, Doctor doctor){
        Doctor doctor1=doctorRepository.findById(id).orElse(null);
        if(doctor1!=null){
           doctor1.setName(doctor.getName());
           doctorRepository.save(doctor);

    }
}
}
