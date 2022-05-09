package com.springbootdockermongodbredis.springbootdockermongodbredis.business.abstracts;

import java.util.List;

import com.springbootdockermongodbredis.springbootdockermongodbredis.entities.concretes.PhoneBook;

public interface PhoneService {

	PhoneBook add(PhoneBook phoneBook);
	
	List<PhoneBook> getAll();
	
}
