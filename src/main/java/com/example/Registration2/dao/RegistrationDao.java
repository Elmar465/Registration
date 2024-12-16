package com.example.Registration2.dao;

import com.example.Registration2.model.RegistrationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationDao extends JpaRepository<RegistrationModel, Integer> {
}
