package com.amigosCode.security.Spring_Security.Student;

import org.springframework.web.bind.annotation.*;

import javax.management.remote.SubjectDelegationPermission;
import javax.persistence.PostLoad;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/students")
public class StudentManagementController {
    private static final List<Student> STUDENTS = new ArrayList<>(Arrays.asList(new Student(1, "james bond"),
            new Student(2, "jones")));

    @GetMapping
    public List<Student> getAllStudents(){
        return STUDENTS;
    }
    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        System.out.println("registerNewStudent ");
        System.out.println(student);
    }
    @DeleteMapping(path="{studentId}")
    public void deleteStudent(@PathVariable("studentId") Integer studentId){
        System.out.println("deleteStudent");
        System.out.println(studentId);
    }

    @PutMapping(path = "{studentId}")
    public  void updateStudent(@PathVariable("studentId") Integer studentId,@RequestBody Student student){
        System.out.println("updateStudent");
        System.out.println(
                String.format("%s %s",studentId,student)
        );
    }
}
