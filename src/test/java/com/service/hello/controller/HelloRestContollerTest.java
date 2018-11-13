/**
 * 
 */
package com.service.hello.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

/**
 * @author usama
 *
 */
@RunWith(SpringRunner.class)
@WebMvcTest(HelloRestController.class)
public class HelloRestContollerTest {

    Logger logger = Logger.getLogger("Test Logger");

    @Autowired
    private MockMvc mvc;

    @Test
    public void givenHelloService_whenHome_thenReturnWelcomeMsg() throws Exception {

	// given(helloRestController.home()).willReturn("Hello Docker World");

	logger.log(Level.INFO, "Inside testing");

	// mvc.perform(get("/").contentType(MediaType.TEXT_PLAIN)).andExpect(status().isOk());

	// .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
	// .andExpect();
    }

}
