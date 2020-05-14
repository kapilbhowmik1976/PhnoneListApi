package com.example.phone.phoneapplication.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.phone.phoneapplication.model.Phone;
/**
 * 
 * @author kapilbhowmik
 *
 */
@Service
public class PhoneServiceImpl implements PhoneService {
	
	static final HashMap<Character,String> map = new HashMap<Character,String>(){{
        put('1', "1");
        put('2',"abc");
        put('3',"def");
        put('4',"ghi");
        put('5',"jkl");
        put('6',"mno");
        put('7',"pqrs");
        put('8',"tuv");
        put('9',"wxyz");
        put('0', "0");
    }} ;

	@Override
	public Phone getPhoneList(Integer id) {
		// TODO Auto-generated method stub
		Phone ph = new Phone();
		ph.setPhoneNumber(String.valueOf(id));
		ph.setListComb(phoneCombinations(String.valueOf(id)));
		return ph;
	}
	
	public ArrayList<String> phoneCombinations(String digits) {
        ArrayList<String> resultArr = new ArrayList<String>();
        ArrayList<String> preresultArrultArr = new ArrayList<String>();
        resultArr.add("");

        for(int i = 0; i < digits.length(); i++) {
            String letters = map.get(digits.charAt(i));
            if (letters.length() == 0) {
                continue;
            }
            for(String str : resultArr) {
                for(int j = 0; j < letters.length(); j++)
                    preresultArrultArr.add(str + letters.charAt(j));
            }
            resultArr = preresultArrultArr;
            preresultArrultArr = new ArrayList<String>();
        }      
        return resultArr;
    }

}
