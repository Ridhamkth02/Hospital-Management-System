package com.hms.hospital_management_system.service;

import com.hms.hospital_management_system.models.Doctor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    public List<Doctor> getAllDoctors(){
        try{
            System.out.println("into service layer");
            //interact with repository layer
            return null;
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            return null;
        }

    }

    public Doctor getDoctorById(Long id){
        try{
            return null;
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            return null;
        }
    }


    public Doctor createDoctor(Doctor doctor){
        try{
            return null;
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            return null;
        }
    }

    public void deleteDoctor(Long id){
        try{

        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());

        }
    }

    public Doctor updateDoctor(Long id){
        try{
            return null;
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            return null;
        }
    }
}
