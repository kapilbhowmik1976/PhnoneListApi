package com.example.phone.phoneapplication.controller;
import org.springframework.web.bind.annotation.RestController;

import com.example.phone.phoneapplication.delegate.PhoneComponent;
import com.example.phone.phoneapplication.model.Phone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 
 * @author kapilbhowmik
 *
 */
@RestController
@RequestMapping("/phone")
public class PhoneController {
	
	@Autowired
	private  PhoneComponent phoneDelegate;
	
	@CrossOrigin
	@GetMapping("/getPhoneList/{id}")
    public ResponseEntity<Phone> getPhoneList(@PathVariable Integer id) {
        Phone phone = phoneDelegate.getPhoneList(id);
        return ResponseEntity.ok(phone);

    }
}
