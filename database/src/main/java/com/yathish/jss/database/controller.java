package com.yathish.jss.database;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class controller {

    @Autowired
    private studentservice studentservice;

    @GetMapping("/student")
    private List<student> getallstudents()
    {
        return studentservice.getallstudents();

    }
    @PostMapping("/student")
    private ResponseEntity<Map<String, String>> addstudent(@RequestBody  student student)
    {   studentservice.addstudent(student);
        Map<String, String> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "Student information submitted successfully!");
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/student/{id}")
    private ResponseEntity<Void> deletestudent(@PathVariable String id)
    {
        studentservice.deletestudent(id);
        return ResponseEntity.noContent().build();

    }
    @GetMapping("/student/{id}")
    private student getstudent(@PathVariable String id)
    {
        return studentservice.getstudent(id);
    }

}
