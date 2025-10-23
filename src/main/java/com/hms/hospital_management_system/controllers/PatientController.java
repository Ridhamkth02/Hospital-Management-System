package com.hms.hospital_management_system.controllers;

import com.hms.hospital_management_system.models.Patient;
import com.hms.hospital_management_system.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping
    public List<Patient> getAllPatients(){
        System.out.println("Fetching the Patients");
        return patientService.getAllPatients();

    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient){
        System.out.println("Creating patient");
        return patientService.createPatient(patient);
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id){
        System.out.println("Fetching id by ID");
        return patientService.getPatientById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id){
        System.out.println("Deleting Patient with Id: " + id);
        patientService.deletePatient(id);

    }


    @PutMapping("/{id}")
    public void updatePatient(@PathVariable Long id){
        System.out.println("Updating Patient with Id: " + id);
        patientService.updatePatient(id);

    }







}
