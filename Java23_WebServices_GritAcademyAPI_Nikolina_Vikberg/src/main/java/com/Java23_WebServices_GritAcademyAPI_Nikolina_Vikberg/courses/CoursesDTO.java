package com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.courses;

import com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.students.StudentsDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CoursesDTO {

    private Long id;
    private String name;
    private String points;
    private String description;

    List<StudentsDTO> students;


}
