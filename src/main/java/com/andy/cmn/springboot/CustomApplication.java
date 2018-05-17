package com.andy.cmn.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


/**
 * 启动类
 * @author Andy wang
 * <br/>com.andy.cmn.springboot.Application
 * @version 2018年5月1日 下午10:02:22
 */
@SpringBootApplication(scanBasePackages={"com.andy"})
public class CustomApplication extends SpringBootServletInitializer
{
	
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CustomApplication.class);
    }
	
    public static void main(String[] args) {  
    	SpringApplication.run(CustomApplication.class, args);
    }
    
}