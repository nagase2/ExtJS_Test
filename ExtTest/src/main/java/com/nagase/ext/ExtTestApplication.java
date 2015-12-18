package com.nagase.ext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class ExtTestApplication {

	
    public static void main(String[] args) {
        SpringApplication.run(ExtTestApplication.class, args);
    }
    
    @RequestMapping("/job1")
    @ResponseBody
    String test1() {
    	
    	return "OOOK";
    }
    
    //ここにJSPのサンプルを追加
}
