package com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.studentsCourses;

import com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.courses.*;
import com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.students.Students;
import com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.students.StudentsDTO;
import com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.students.StudentsRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Service
public class StudentsCoursesService {

    @Autowired
    StudentsRepository studentsRepository;
    CoursesRepository coursesRepository;
    CoursesService coursesService;
    StudentsCoursesRepository studentsCoursesRepository;
    /*

    public void saveStudentsToCourses(Long courses_id, Long students_id) {
        Optional<Students> students = studentsRepository.findById(students_id);
        Optional<Courses> courses = coursesRepository.findById(courses_id);
        if (!students.isEmpty() && !courses.isEmpty()) {
            studentsCoursesRepository.save(students.get(), courses.get());
        } else {
            throw new InvalidRequestHandler(null);
        }
    }

   /*
    public void removeStudentsFromCoursesById(Long id) {
        studentsCoursesRepository.deleteById(id);
    }

    */
}


