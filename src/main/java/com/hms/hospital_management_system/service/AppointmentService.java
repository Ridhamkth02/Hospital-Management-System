package com.hms.hospital_management_system.service;

import com.hms.hospital_management_system.models.Appointment;
import com.hms.hospital_management_system.models.Doctor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    public List<Appointment> getAllAppointments(){
        try{
            System.out.println("into service layer");
            //interact with repository layer
            return null;
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            return null;
        }

    }

    public Appointment getAppointmentById(Long id){
        try{
            return null;
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            return null;
        }
    }


    public Appointment createAppointment(Appointment Appointment){
        try{
            return null;
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            return null;
        }
    }

    public void deleteAppointment(Long id){
        try{

        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());

        }
    }

    public Appointment updateAppointment(Long id){
        try{
            return null;
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            return null;
        }
    }
}
