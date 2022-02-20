package com.example.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.demo.entities.Vendor;

@Component
public class vendorservice {

	@Autowired
	IVendorPersistance vendorpers;

	public List<Vendor> readAllVendors() {
		return vendorpers.findAll();

	}

	public Optional<Vendor> getsingleVendorById(Long vendrocode) {
		
		return vendorpers.findById(vendrocode);
	}
	
	
//	
   public Vendor changevendor(Vendor payload) {
	Optional<Vendor> vendorfind =	vendorpers.findById(payload.getId());
	if(!vendorfind.isPresent()) {
//		return new Vendor((long)0 , "" , "" , " " , " " , " " , " ", null);
		return new Vendor();
	}
	
	return vendorpers.save(payload);
	
		
	}


	public List<Vendor> searchbycompany(String Companyname) {
		return vendorpers.findByCompanyName(Companyname);

	}
	
	public List<Vendor> custommethodtolookforGST(String gstno) {
		return vendorpers.custommethodtolookforGST(gstno);

	}
	
	
	public Vendor createVendor(Vendor vendorobj) {
		return vendorpers.save(vendorobj);
	}
	
	public String deleteVendor(Long id) {
		 vendorpers.deleteById(id);
		return "vendor deleted";
	}
	

}
