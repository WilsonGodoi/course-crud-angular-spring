package com.wilsongodoi.crudspring.repository;

import com.wilsongodoi.crudspring.model.Course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
