/**
 * 
 */
package com.service.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author usama
 *
 */
@RestController
public class HealthCheckController {
    @RequestMapping("/healthcheck")
    public String beat() {
	return "I am alive";
    }
}
