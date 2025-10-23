package com.hms.hospital_management_system.controllers;

import com.hms.hospital_management_system.models.Appointment;
import com.hms.hospital_management_system.models.Bill;
import com.hms.hospital_management_system.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/bills")
public class BillController {

    @Autowired
    private BillService billService;

    @GetMapping
    public List<Bill> getAllBills(){
        System.out.println("Fetching all Bills");
        return billService.getAllBills() ;
    }

    @PostMapping
    public Bill createBill(@RequestBody Bill bill){
        System.out.println("Creating bill");
        return billService.createBill(bill);
    }

    @GetMapping("/{id}")
    public Bill getBillById(@PathVariable Long id){
        System.out.println("Fetching bill by ID: " + id);
        return billService.getBillById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBill(@PathVariable Long id){
        System.out.println("Deleting Bill with Id: " + id);
        billService.deleteBill(id);

    }


    @PutMapping("/{id}")
    public void updateBill(@PathVariable Long id){
        System.out.println("Updating Bill with Id: " + id);
        billService.updateBill(id);

    }
}
