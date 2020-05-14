package com.example.phone.phoneapplication.delegate;

import org.springframework.stereotype.Component;
import com.example.phone.phoneapplication.model.Phone;
import com.example.phone.phoneapplication.service.PhoneServiceImpl;
/**
 * 
 * @author kapilbhowmik
 *
 */
@Component
public class PhoneComponent {
	private final PhoneServiceImpl phoneService;
	
	public PhoneComponent(PhoneServiceImpl phoneService) {
		this.phoneService = phoneService;
	}

	public Phone getPhoneList(Integer id){
		
		return phoneService.getPhoneList(id);
		
	}
}
