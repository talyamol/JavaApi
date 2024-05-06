package com.example.myapi.repositories;


import com.example.myapi.entities.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DoctorRepository extends CrudRepository<Doctor,Integer> {




}
