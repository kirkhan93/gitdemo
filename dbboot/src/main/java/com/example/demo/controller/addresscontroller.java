package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Address;
import com.example.demo.service.IAddressPersistance;
import com.example.demo.service.addressservice;
import com.example.demo.service.vendorservice;


@RestController
public class addresscontroller {

	@Autowired
	addressservice addressserviceobject;

	
	@RequestMapping("/address")
	public List<Address> getAddress(){
		return addressserviceobject.getAddressAll();
	}
	
	@PostMapping("/address")
	public Address createAddress(@RequestBody  Address payload){
		return addressserviceobject.createAddress(payload);
	}
}
