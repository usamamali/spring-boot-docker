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
public class HelloRestController {
    @RequestMapping("/")
    public String home() {
	return "Hello Docker World using CI";
    }
}
