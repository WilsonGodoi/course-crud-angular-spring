package com.wilsongodoi.crudspring.controller;

import java.util.List;

import com.wilsongodoi.crudspring.model.Course;
import com.wilsongodoi.crudspring.repository.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/courses")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping
    public List<Course> list() {
        return courseRepository.findAll();
    }

    /**
     * Example with ResponseEntity
     * @param newCourse
     * @return
     */
    // @RequestMapping(method = RequestMethod.POST)
    // @PostMapping
    // public ResponseEntity<Course> create(@RequestBody Course newCourse) {
    //     return ResponseEntity.status(HttpStatus.CREATED).body(courseRepository.save(newCourse));
    // }

    // @RequestMapping(method = RequestMethod.POST)
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Course create(@RequestBody Course newCourse) {
        return courseRepository.save(newCourse);
    }

}
