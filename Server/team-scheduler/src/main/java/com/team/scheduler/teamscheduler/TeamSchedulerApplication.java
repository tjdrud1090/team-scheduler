package com.team.scheduler.teamscheduler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.validation.constraints.Email;

@SpringBootApplication
@Slf4j
public class TeamSchedulerApplication {

    @Email(regexp = ".+@.+\\\\..+")
    String emailAddress = "name@me_ed.com";

    public static void main(String[] args) {
        SpringApplication.run(TeamSchedulerApplication.class, args);

        System.out.println("Start");
        log.info("[{}] - complete", "testtesttestest");


        //PR 요청
    }

}
