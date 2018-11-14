/**
 * 
 */
package com.service.hello.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

/**
 * @author usama
 *
 */
@RunWith(SpringRunner.class)
@WebMvcTest(HealthCheckController.class)
public class HealthCheckContollerTest {

    Logger logger = Logger.getLogger("Test Logger");

    @Autowired
    private MockMvc mvc;

    @Test
    public void givenHelloService_whenHealthCheck_thenReturnWelcomeMsg() throws Exception {

	// given(helloRestController.home()).willReturn("Hello Docker World");

	logger.log(Level.INFO, "Inside testing ..");

	mvc.perform(get("/healthcheck").contentType(MediaType.TEXT_PLAIN)).andExpect(status().isOk());

	// .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
	// .andExpect();
    }

}
