package com.example.demo.entities;

import java.util.ArrayList;
import java.util.Date;
import com.example.demo.*;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;  // replacement for line 14
import org.springframework.stereotype.Component;


@Entity
@Table(name="Vendor")
public class Vendor {
	
//	@javax.persistence.Id
	@Id
	@Column(nullable=false , name="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long Id;
	@Column(nullable=false , name="COMPANY_NAME")
	public String companyName;
	@Column(nullable=false , name="CONTACT_NAME")
	public String contactName;
	@Column(nullable=false , name="LAST_NAME")
	public String lastname;
	@Column(nullable=false , name="WEBSITE")
	public String website;
	@Column(nullable=false , name="EMAIL")
	public String email;
//	@Column(nullable=true , name="REG_DATE")
//	public Date regdate;
	@Column(nullable=false , name="STATUS")
	public String status;
	@Column(nullable=false , name="GST_NO")
	public String gstno;
	
	//to create association with Address table
  
	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
	@JoinColumn(name="vendor" , referencedColumnName = "ID")
	private List<Address> addressobject = new ArrayList<>();
	

	
//	public Vendor(long l, String string, String string2, String string3, String string4, String string5, String string6, Object object) {
//		
//	}
	

	public Vendor() {
		
	}


	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getLastname() {
		return lastname;
	}
	public List<Address> getAddressobject() {
		return addressobject;
	}


	public void setAddressobject(List<Address> addressobject) {
		this.addressobject = addressobject;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
//	public Date getRegdate() {
//		return regdate;
//	}
//	public void setRegdate(Date regdate) {
//		this.regdate = regdate;
//	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGstno() {
		return gstno;
	}
	public void setGstno(String gstno) {
		this.gstno = gstno;
	}
	
	
	
	
	
	
	

}
