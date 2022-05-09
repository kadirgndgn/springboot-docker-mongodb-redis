package com.springbootdockermongodbredis.springbootdockermongodbredis.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootdockermongodbredis.springbootdockermongodbredis.business.abstracts.PhoneService;
import com.springbootdockermongodbredis.springbootdockermongodbredis.entities.concretes.PhoneBook;

@RestController
@RequestMapping("/phoneBook/")
public class PhoneBookController {

	private PhoneService phoneService;
	
	@Autowired
	public PhoneBookController(PhoneService phoneService) {
		super();
		this.phoneService = phoneService;
	}

	@GetMapping("getAll")
	public ResponseEntity<List<PhoneBook>> getAll() {
		return ResponseEntity.ok(this.phoneService.getAll());
	}

	@PostMapping("add")
	public ResponseEntity<PhoneBook> add(@RequestBody PhoneBook phoneBook) {
		return ResponseEntity.ok(this.phoneService.add(phoneBook));
	}

}
