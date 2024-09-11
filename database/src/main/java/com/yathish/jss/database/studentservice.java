package com.yathish.jss.database;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentservice {
    @Autowired
    private student_repo student_repo;

    public student addstudent(student student)
    {
        return student_repo.save(student);
    }
    public student getstudent(String id)
    {
        return student_repo.findById(id).orElse(null);
    }
    public List<student> getallstudents()
    {
        return student_repo.findAll();
    }
    public student updatestudent(student student)
    {
        return student_repo.save(student);
    }
    public student deletestudent(String id)
    {
        student s = student_repo.getById(id);
        student_repo.deleteById(id);
        return s;
    }


}
