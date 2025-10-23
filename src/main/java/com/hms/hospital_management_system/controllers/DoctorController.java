package com.hms.hospital_management_system.controllers;

import com.hms.hospital_management_system.models.Appointment;
import com.hms.hospital_management_system.models.Doctor;
import com.hms.hospital_management_system.service.AppointmentService;
import com.hms.hospital_management_system.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping
    public List<Doctor> getAllDoctors(){
        System.out.println("Fetching all Doctors");
        return doctorService.getAllDoctors() ;
    }

    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor){
        System.out.println("Creating doctor");
        return doctorService.createDoctor(doctor);
    }

    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable Long id){
        System.out.println("Fetching Doctor by ID: " + id);
        return doctorService.getDoctorById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable Long id){
        System.out.println("Deleting Doctor with Id: " + id);
        doctorService.deleteDoctor(id);

    }


    @PutMapping("/{id}")
    public void updateDoctor(@PathVariable Long id){
        System.out.println("Updating Doctor with Id: " + id);
        doctorService.updateDoctor(id);
    }
}
