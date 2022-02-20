package com.example.demo.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Vendor;

//extendig JPA repo will automatically give CRUD capabilities
public interface IVendorPersistance extends JpaRepository<Vendor, Long> {
	List<Vendor> findByCompanyName(String companyName);
	
	
	@Query(nativeQuery = true , value ="SELECT * FROM public.vendor where gst_no like %?1%" )
//	@Query(nativeQuery = true , value ="SELECT * FROM public.vendor where lower(gst_no) like %?1%" )
	List<Vendor> custommethodtolookforGST(String gstno);
}
