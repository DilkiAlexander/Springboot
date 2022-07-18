package com.example.demo2.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {

    @NotEmpty
    @Id
    @Size(max = 10,min = 12)
    private int id;

    @NotEmpty
    @Size(max = 10,min = 8)
    private String stNo;

    @NotEmpty
    @Size(min= 10 ,message = "Student name should have at least 10 characters")
    private String stName;

    @NotEmpty
    private String city;


    @NotNull
    @Email
    private String email;


}
