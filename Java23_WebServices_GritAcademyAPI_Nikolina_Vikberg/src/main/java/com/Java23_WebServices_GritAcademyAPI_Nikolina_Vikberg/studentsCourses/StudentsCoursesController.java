package com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.studentsCourses;

import com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.courses.Courses;
import com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.courses.CoursesRepository;
import com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.courses.CoursesService;
import com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.courses.InvalidRequestHandler;
import com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.students.Students;
import com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.students.StudentsDTO;
import com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.students.StudentsRepository;
import com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.students.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
public class StudentsCoursesController {

    @Autowired
    StudentsService studentsService;
    StudentsRepository studentsRepository;
    CoursesService coursesService;
    CoursesRepository coursesRepository;
    StudentsCoursesService studentsCoursesService;




/*


    @PostMapping(value = "/createStudentsToCourses")
    public ResponseEntity<List<StudentsCourses>> createStudentsToCourses (
                                                             @RequestParam (value = "students_id") Long students_id,
                                                             @RequestParam(value = "courses_id") Long courses_id) {
        studentsCoursesService.saveStudentsToCourses(students_id, courses_id);
        return null;
    }


/*
    //@PostMapping(value = "/addStudentsToCourses")
    @RequestMapping(value = "/addStudentsToCourses", method = {RequestMethod.POST})

    public ResponseEntity<List<StudentsDTO>> addStudentsToCourses (@RequestParam (value = "students_id") Long students_id,
                                                                   @RequestParam (value = "courses_id") Long courses_id, Students students, Courses courses){
        studentsService.addStudentsToCourses(students_id, courses_id);
        return new ResponseEntity<>(studentsService.getAllStudents(), HttpStatus.OK);

    }




 */

}


