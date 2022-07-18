package com.example.demo2.Controller;

import com.example.demo2.dto.StudentDTO;
import com.example.demo2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin
public class MethodController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getStudents")
    public List<StudentDTO> getUser(){
        return studentService.getAllStudentDetails();
    }

    @PostMapping("/saveStudent")
    public StudentDTO saveStudent(@RequestBody StudentDTO studentDTO){
        return studentService.saveStudent(studentDTO);
    }

    @PutMapping("/update")
    public StudentDTO updateUser(@RequestBody StudentDTO studentDTO){
        return studentService.updateStudent(studentDTO);
    }

    @DeleteMapping("/delete")
    public boolean deleteUser(@RequestBody StudentDTO studentDTO)
    {
        return studentService.deleteStudent(studentDTO);
    }
}
