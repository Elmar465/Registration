package com.example.Registration2.controller;


import com.example.Registration2.model.RegistrationModel;
import com.example.Registration2.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(name = "/Registration")
public class RegistrationController {



    @Autowired
    private RegistrationService registrationService;


    //Create a Customer
    @PostMapping(value = "/registration")
    public RegistrationModel createCustomer(@RequestBody RegistrationModel create){
        return registrationService.createCustomer(create);
    }


    //Get all Custoemr
    @GetMapping(value = "/getAllCustomer/{customers}")
    public Iterable<RegistrationModel> getAllCustomer(){
        return registrationService.getAllCustomer();
    }

    //Get Single Customer
    //Get a Single customer
    @GetMapping(value = "/getSingleCustomer/{customer_id}")
    public RegistrationModel getSingleCustomer(@PathVariable("customer_id") Integer customer_id){
        return registrationService.getSingleCustomer(customer_id);
    }

    //Update a Customer
    @PutMapping(value = "/updateCustomer/{customer_id}/{new_email}")
    public RegistrationModel updateCusomer(@PathVariable("customer_id") Integer customer_id,
                                           @PathVariable("new_email") String new_mail){
        return registrationService.updateCustomerDetails(customer_id, new_mail);
    }

    //Delete Customer Detail
    public void deleteCustomerDetail(Integer customer_id){
        registrationService.delteCustomerDetail(customer_id);
    }

}