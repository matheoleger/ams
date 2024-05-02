package com.sip.ams;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
class TestProviderController {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void Test_listProvider() throws Exception
	{
		this.mockMvc.perform(get("/providers")).andExpect(status().isOk())
		.andExpect(content().string(containsString("Samsung")))
		.andExpect(content().string(containsString("Orange")))
		.andExpect(content().string(containsString("HP")));
	}

}
