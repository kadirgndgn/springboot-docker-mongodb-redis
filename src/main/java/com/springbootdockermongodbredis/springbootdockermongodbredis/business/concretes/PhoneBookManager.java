package com.springbootdockermongodbredis.springbootdockermongodbredis.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.springbootdockermongodbredis.springbootdockermongodbredis.business.abstracts.PhoneService;
import com.springbootdockermongodbredis.springbootdockermongodbredis.dataAccess.abstracts.PhoneBookDao;
import com.springbootdockermongodbredis.springbootdockermongodbredis.entities.concretes.PhoneBook;

@Service
public class PhoneBookManager implements PhoneService{
	
	private PhoneBookDao phoneBookDao;

	@Autowired
	public PhoneBookManager(PhoneBookDao phoneBookDao) {
		super();
		this.phoneBookDao = phoneBookDao;
	}

	@Override
	public PhoneBook add(PhoneBook phoneBook) {
		return this.phoneBookDao.save(phoneBook);
	}

	@Override
	@Cacheable(cacheNames = "getAll")
	public List<PhoneBook> getAll() {
		return this.phoneBookDao.findAll();
	}

}
