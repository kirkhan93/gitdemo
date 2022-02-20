package com.example.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Address;

public interface IAddressPersistance extends JpaRepository<Address, Long> {

}
