package com.wilsongodoi.crudspring.controller;

import java.util.List;

import com.wilsongodoi.crudspring.model.Course;
import com.wilsongodoi.crudspring.repository.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/courses")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping
    public List<Course> list() {
        return this.courseRepository.findAll();
    }

}
