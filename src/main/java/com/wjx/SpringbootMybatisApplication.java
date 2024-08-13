package com.wjx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.wjx")
public class SpringbootMybatisApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootMybatisApplication.class, args);
  }

}
