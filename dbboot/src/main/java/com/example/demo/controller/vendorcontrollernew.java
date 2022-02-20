package com.example.demo.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entities.Vendor;
//Automatically generate CURDQ functionality
@RepositoryRestResource(collectionResourceRel = "vendor" , path = "newvendor")
public interface vendorcontrollernew extends JpaRepository<Vendor, Long> {

}
