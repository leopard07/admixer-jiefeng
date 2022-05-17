package com.yamimi.admixer.backend_main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class AdMixerApplication {

    public static void main(String[] args) {

        SpringApplication.run(AdMixerApplication.class, args);
    }

}

