package com.springbootdockermongodbredis.springbootdockermongodbredis.dataAccess.abstracts;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springbootdockermongodbredis.springbootdockermongodbredis.entities.concretes.PhoneBook;

public interface PhoneBookDao extends MongoRepository<PhoneBook, Integer>{

}
