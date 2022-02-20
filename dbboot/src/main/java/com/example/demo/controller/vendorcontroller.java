package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Vendor;
import com.example.demo.service.vendorservice;

@RestController

public class vendorcontroller {

	@Autowired
	vendorservice vendorserviceobject;

	@RequestMapping("/vendor")
	public List<Vendor> getVendors() {
		return vendorserviceobject.readAllVendors();
	}

	@RequestMapping("/vendor/{code}")
	public Vendor getVendorById(@PathVariable("code") Long code) {
		Optional<Vendor> searchResult = vendorserviceobject.getsingleVendorById(code);
		if(!searchResult.isPresent()) {
			return new Vendor();
//			return new Vendor((long)0 , "" , "" , " " , " " , " " , " ", null);
			}
		return searchResult.get();
		}
		
		
	

//	
	@PostMapping("/vendor")
	public Vendor createVendor(@RequestBody Vendor mypostbody) {
		return vendorserviceobject.createVendor(mypostbody);

	}
	// http://localhost:8080/vendor/lookup?gstno=ABC
   //	@RequestMapping("/vendor/lookup")
   //	public List<Vendor> searchvendorbyGST(@RequestParam String gstno){
   //		return vendorserviceobject.custommethodtolookforGST(gstno);
   //	}

	// http://localhost:8080/vendor/lookup/ABC
	@RequestMapping("/vendor/lookup/{gstno}")
	public List<Vendor> searchvendorbyGST(@PathVariable("gstno") String gstno) {
		return vendorserviceobject.custommethodtolookforGST(gstno);
	}

	@RequestMapping("/vendor/search")
	public List<Vendor> searchbycompany(@RequestParam String company) {
		return vendorserviceobject.searchbycompany(company);
	}
//	

	@RequestMapping(method=RequestMethod.PUT, value="/change")
	public Vendor updateVendor(@RequestBody Vendor mypostbody) {	
		return vendorserviceobject.changevendor(mypostbody);
	}
	
	// http://localhost:8080/vendor/delete/4
	@RequestMapping(method = RequestMethod.DELETE , value ="/vendor/{id}")
	public String deleteVendor(@PathVariable("id") Long id) {	
		return vendorserviceobject.deleteVendor(id);
	}	
	

}