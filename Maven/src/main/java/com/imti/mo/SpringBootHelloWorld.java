package com.imti.mo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication  //SpringBoot核心注解
//@Configuration
//@EnableAutoConfiguration
@RestController
//@ResponseBody  //restful
//@Controller   //控制层
public class SpringBootHelloWorld {

	@RequestMapping("/test")
    @ResponseBody
    public String test(){
	//System.out.println(1/0);
       return "ok";
    }

	@RequestMapping("test1")
	public String test1() {
		
		return "index.jsp";
	}
	
	public static void main(String[] args) {
		//启动应用程序
		SpringApplication.run(SpringBootHelloWorld.class, args);
		
	}

}
