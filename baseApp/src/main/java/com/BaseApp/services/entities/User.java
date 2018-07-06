package com.BaseApp.services.entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User extends AbstractEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userid")
	private long id;
	private String prefix;
	private String firstname;
	private String middlename;
	private String lastname;
	private String suffix;
	//@OneToOne(mappedBy = "user")
	//private UserAuth userAuth;
	
	@OneToMany(mappedBy = "user")
	private Set<Useraddress> addresses;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public Set<Useraddress> getAddress() {
		return addresses;
	}

	public void setAddress(Set<Useraddress> address) {
		this.addresses = address;
	}
	
	public void addUserAddress(Useraddress address) {
		if (addresses!=null) {
			addresses = new HashSet<>();
		}
		address.setUser(this);
		addresses.add(address);
	}




}
