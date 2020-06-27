package cn.interhorse.springboot.customconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class CustomConfigurationApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomConfigurationApplication.class, args);
    }

}
