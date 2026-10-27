package com.madani.taskmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class testController {

    @GetMapping("/test")
    public String test () {
        return "Mon appli spring boot";
    }

    @GetMapping("/taches")
    public List<String> tasks () {
        List <String> task = new ArrayList<>();
        for (int i=1; i<10; i++) {
            task.add("task " + i);
        }
        return task;
    }
}
