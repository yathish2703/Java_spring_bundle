package com.lilly.adds.test.bench;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.management.relation.RelationServiceNotRegisteredException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class maincontroller
{
    private Map<String,student> data = new HashMap<String,student>(){{
        put("1",new student("1","yathish","yathish971@gmail.com","mysore"));
        put("2",new student("2","ramesh","ramesh@gmail.com","chennai"));
    }};


    @GetMapping("/")
    private String helloworld()
    {
        return "<h1>Hi Controller is created</h1>";

    }

    @GetMapping("/student")
    private Collection<student> Getstudentinfromation()
    {
        return data.values();
    }
    @GetMapping("/student/{id}")
    private student Getstudentinfo(@PathVariable String id)
    {
        student s = data.get(id);
        if(s==null) {
            throw  new ResponseStatusException(HttpStatus.NOT_FOUND);

        }
        else{
            return  s;
        }


    }
    @DeleteMapping("/student/{id}")
    private ResponseEntity<Void> deletestudentinfo(@PathVariable String id )
    {
        student s = data.remove(id);
        if (s==null)
        {
            throw  new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        else {
            return ResponseEntity.noContent().build();
        }
    }

    @PostMapping("/student")
    private ResponseEntity<Map<String, String>> addstudent(@RequestBody student s)
    {
        data.put(s.getId(),s);
        Map<String, String> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "Student information submitted successfully!");

        // Returning response with a 200 status
        return ResponseEntity.ok(response);

    }


}
