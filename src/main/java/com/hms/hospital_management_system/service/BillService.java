package com.hms.hospital_management_system.service;

import com.hms.hospital_management_system.models.Bill;
import com.hms.hospital_management_system.models.Patient;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BillService {

    public List<Bill> getAllBills(){
        try{
            System.out.println("into service layer");
            //interact with repository layer
            return null;
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            return null;
        }

    }

    public Bill getBillById(Long id){
        try{
            return null;
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            return null;
        }
    }


    public Bill createBill(Bill bill){
        try{
            return null;
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            return null;
        }
    }

    public void deleteBill(Long id){
        try{

        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());

        }
    }

    public Bill updateBill(Long id){
        try{
            return null;
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            return null;
        }
    }
}
