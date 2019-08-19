package com.bgy.customerwaterscore;

import com.bgy.customerwaterscore.service.ContextAwareTest;
import org.apache.catalina.core.ApplicationContext;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bgy.customerwaterscore.dao")
public class CustomerwaterscoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerwaterscoreApplication.class, args);
    }

}
