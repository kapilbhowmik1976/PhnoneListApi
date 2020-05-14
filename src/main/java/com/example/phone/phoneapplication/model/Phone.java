package com.example.phone.phoneapplication.model;

import java.util.List;
/**
 * 
 * @author kapilbhowmik
 *
 */
public class Phone {
	private String phoneNumber;
	private List<String> listComb;
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public List<String> getListComb() {
		return listComb;
	}
	public void setListComb(List<String> listComb) {
		this.listComb = listComb;
	}
}
