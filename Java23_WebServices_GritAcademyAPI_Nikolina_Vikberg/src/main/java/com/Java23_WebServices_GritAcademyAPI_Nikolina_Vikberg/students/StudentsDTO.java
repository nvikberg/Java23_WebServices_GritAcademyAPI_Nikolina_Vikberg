package com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.students;

import com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.courses.CoursesDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentsDTO {


    private Long id;
    private String fname;
    private String lname;
    private String town;



    List<CoursesDTO> courses;
}
