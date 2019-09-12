package com.athome.springboot;

import com.athome.springboot.service.KafkaSender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot04WebRestfulcrudApplication {


    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBoot04WebRestfulcrudApplication.class, args);
        KafkaSender bean = context.getBean(KafkaSender.class);
        while (true) {
                System.out.println("111");
                bean.send();

                Thread.sleep(3000);
        }
    }

}
