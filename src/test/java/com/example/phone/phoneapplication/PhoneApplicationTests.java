package com.example.phone.phoneapplication;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.context.WebApplicationContext;

import com.example.phone.phoneapplication.model.Phone;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.http.MediaType;

@SpringBootTest
@AutoConfigureMockMvc
class PhoneApplicationTests {

	@Autowired
	private MockMvc mvc;
	
	@Autowired
	   WebApplicationContext webApplicationContext;
	
	public void setUp() {
	      mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	   }
	
	  @Test
	   public void getPhoneList() throws Exception {
	      String uri = "/phone/getPhoneList/2039999988";
	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
	         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
	      
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(200, status);
	      String content = mvcResult.getResponse().getContentAsString();
	      Phone phone = mapFromJson(content, Phone.class);
	      assertTrue(phone.getListComb().size() > 0);
	   }

	  public <T> T mapFromJson(String json, Class<T> clazz)
		      throws JsonParseException, JsonMappingException, IOException {
		      
		      ObjectMapper objectMapper = new ObjectMapper();
		      return objectMapper.readValue(json, clazz);
		   }
}
