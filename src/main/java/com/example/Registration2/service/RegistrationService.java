package com.example.Registration2.service;

import com.example.Registration2.dao.RegistrationDao;
import com.example.Registration2.model.RegistrationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired(required = true)
    private RegistrationDao registrationDao;


    //Create a Customer
    public RegistrationModel createCustomer(RegistrationModel create){
        return registrationDao.save(create);
    }


    //Get All Customer
    public Iterable<RegistrationModel> getAllCustomer(){
        return registrationDao.findAll();
    }

    //Get Single Customer
    public RegistrationModel getSingleCustomer(Integer custoemr_id){
        return registrationDao.findById(custoemr_id).orElse(new RegistrationModel());
    }

    // Update Customer
    public RegistrationModel updateCustomerDetails(Integer customer_id, String new_email){
        RegistrationModel  rt = getSingleCustomer(customer_id);
        rt.setEmail(new_email);
        return registrationDao.save(rt);
    }

    // Delete Customer Detail
    public void delteCustomerDetail(Integer customer_id){
        registrationDao.deleteById(customer_id);
    }
}
