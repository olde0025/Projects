package com.BaseApp.services.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "useraddress")
public class Useraddress extends AbstractEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "useraddressid")
	private long id;
	private int addresstype;
	private String address1;
	private String address2;
	private String address3;
	private String city;
	private String postalcode;
	private String country;
	private String stateprov;
	
	@ManyToOne
	@JoinColumn(name = "userid")
	private User user;

	public long getUseraddressid() {
		return id;
	}

	public void setUseraddressid(long id) {
		this.id = id;
	}

	public int getAddresstype() {
		return addresstype;
	}

	public void setAddresstype(int addresstype) {
		this.addresstype = addresstype;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStateprov() {
		return stateprov;
	}

	public void setStateprov(String stateprov) {
		this.stateprov = stateprov;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

//	@Override
//	public boolean equals(Object obj) {
//		return Objects.equals(id, ((Useraddress) obj).id);
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(id);
//	}
//	
//	public Long getResourceId() {
//		return this.id;
//	}

}
