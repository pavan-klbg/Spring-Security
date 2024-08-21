package com.telusko.basicSpringSecurity;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> myStudents=new ArrayList<>(List.of(
            new Student(12,"Pavan",34),
            new Student(34,"amar",45)));

    @GetMapping("/students")
    public List<Student> getAllStudents(){
return  myStudents;
    }

    @PostMapping("/students")
    public  Student addStudent(@RequestBody Student std){
        myStudents.add(std);
        return  std;
    }

    // getting a csrf token to use for POST mapping using web security

    @GetMapping("/getCsrf")
    public CsrfToken getCSRF(HttpServletRequest request){
return (CsrfToken) request.getAttribute("_csrf");

    }


}
