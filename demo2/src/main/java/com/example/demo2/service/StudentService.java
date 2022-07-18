package com.example.demo2.service;

import com.example.demo2.dto.StudentDTO;
import com.example.demo2.entity.Student;
import com.example.demo2.repository.StudentRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private ModelMapper modelMapper;

    public StudentDTO saveStudent(StudentDTO studentDTO){
        studentRepo.save(modelMapper.map(studentDTO, Student.class));
        return studentDTO;
    }

    public List<StudentDTO> getAllStudentDetails(){
        List<Student>studentList = studentRepo.findAll();
        return modelMapper.map(studentList, new TypeToken<List<StudentDTO>>(){}.getType());
    }

    public StudentDTO updateStudent(StudentDTO studentDTO){
        studentRepo.save(modelMapper.map(studentDTO,Student.class));
        return studentDTO;
    }

    public boolean deleteStudent(StudentDTO studentDTO){
        studentRepo.delete(modelMapper.map(studentDTO, Student.class));
        return true;
    }
}
