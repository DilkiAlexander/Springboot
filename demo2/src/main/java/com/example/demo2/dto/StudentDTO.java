package com.example.demo2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentDTO {

    private int id;
    private String stNo;
    private String stName;
    private String city;
    private String email;
}
