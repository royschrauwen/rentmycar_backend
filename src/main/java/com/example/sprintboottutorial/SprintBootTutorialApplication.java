package com.example.sprintboottutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SprintBootTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(SprintBootTutorialApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value="name", defaultValue = "Team RmC") String name){
        return String.format("Hello %s!", name);
    }

    @GetMapping("/bye")
    public String sayBye(@RequestParam(value="name", defaultValue = "Team RmC") String name){
        return String.format("Bye %s!", name);
    }




}
