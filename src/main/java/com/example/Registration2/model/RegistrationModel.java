package com.example.Registration2.model;


import jakarta.persistence.*;

@Entity
@Table(name = "Registration")
public class RegistrationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "customer_name")
    private String name;

    @Column(name = "Customer_lastname")
    private String lastName;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "password", unique = true)
    private Integer password;

    //Getter
    public Integer getId(){
        return id;
    }

    //Getter
    public String getName(){
        return name;
    }

    //Setter
    public void setName(String name){
        this.name =  name;
    }


    //Getter
    public String getLastName(){
        return lastName;
    }

    //Setter
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    //Getter
    public String getEmail(){
        return email;
    }

    //Setter
    public void setEmail(String email){
        this.email =  email;
    }

    //Getter
    public Integer getPassword(){
        return password;
    }


    //Setter
    public void setPassword(Integer password){
        this.password =  password;
    }
}
