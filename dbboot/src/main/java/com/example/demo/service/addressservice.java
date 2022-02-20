package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import com.example.demo.entities.Address;


@Component
public class addressservice {
	
	
	@Autowired
	IAddressPersistance addresspers;
	

	public List<Address> getAddressAll(){
		return addresspers.findAll();
	}
	

	public Address createAddress(Address payload){
		return addresspers.save(payload);
	}
}
