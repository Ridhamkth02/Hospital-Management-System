package com.hms.hospital_management_system.controllers;

import com.hms.hospital_management_system.models.Appointment;
import com.hms.hospital_management_system.models.Patient;
import com.hms.hospital_management_system.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentController  {

    @Autowired
    private AppointmentService appointmentService;

    @GetMapping
    public List<Appointment> getAllAppointments(){
            System.out.println("Fetching the appointments");
        return appointmentService.getAllAppointments() ;
    }

    @PostMapping
    public Appointment createAppointment(@RequestBody Appointment appointment){
        System.out.println("Creating appointment");
        return appointmentService.createAppointment(appointment);
    }

    @GetMapping("/{id}")
    public Appointment getAppointmentById(@PathVariable Long id){
        System.out.println("Fetching id by ID: " + id);
        return appointmentService.getAppointmentById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteAppointment(@PathVariable Long id){
        System.out.println("Deleting appointment with Id: " + id);
        appointmentService.deleteAppointment(id);

    }


    @PutMapping("/{id}")
    public void updateAppointment(@PathVariable Long id){
        System.out.println("Updating appointment with Id: " + id);
        appointmentService.updateAppointment(id);

    }



}
