package com.example.demo.Student;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/student")
public class StudentController {

    static final List<Student> STUDENTS = Arrays.asList(
            new Student(1, "Sarim"),
            new Student(2, "Maaz"),
            new Student(3, "Arish")
    );

    @GetMapping
    public List<Student> getStudents()
    {
        return STUDENTS;
    }

    @PutMapping
    public void updateStudent(@PathVariable int id,  @RequestParam String name)
    {
        return;
    }

    @GetMapping(path = "{id}")
    public Student getStudent(@PathVariable int id)
    {
        return STUDENTS.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException());
    }

}
