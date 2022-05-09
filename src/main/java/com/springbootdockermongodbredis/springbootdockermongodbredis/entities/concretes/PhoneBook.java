package com.springbootdockermongodbredis.springbootdockermongodbredis.entities.concretes;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class PhoneBook implements Serializable{

	@Id

	private int bookId;
	private String personName;
	private String phoneNumber;
	private String title;

	public PhoneBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PhoneBook(int bookId, String personName, String phoneNumber, String title) {
		super();
		this.bookId = bookId;
		this.personName = personName;
		this.phoneNumber = phoneNumber;
		this.title = title;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
