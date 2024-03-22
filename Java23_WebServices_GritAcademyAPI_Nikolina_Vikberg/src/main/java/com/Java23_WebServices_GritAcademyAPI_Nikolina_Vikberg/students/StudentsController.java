package com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.students;

import com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.courses.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Controller
public class StudentsController {

    @Autowired
    StudentsService studentsService;
    StudentsRepository studentsRepository;
    CoursesService coursesService;
    CoursesRepository coursesRepository;


    @GetMapping(value = "/students/", produces = MediaType.APPLICATION_JSON_VALUE)
    List<StudentsDTO> getAllStudents()
    { return studentsService.getAllStudents();
    }

    @GetMapping(value = "/students/{id}/", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<StudentsDTO>> getCoursesForStudents(@PathVariable(value = "id") Long id) {
        List<StudentsDTO> students = studentsService.getCoursesForStudents(id);

        if (id < 1) {
            throw new InvalidRequestHandler("Id must be higher than 0, you typed: " + id);
        }
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @GetMapping(value = "/students/{}/{fname}/", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<StudentsDTO>> searchStudentsByfName(@PathVariable(value = "fname") String fname) {
        List<StudentsDTO> students = studentsService.searchStudentsByfName(fname);

        if (students.isEmpty()) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @GetMapping(value = "/students/{}/{fname}/{lname}/", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<StudentsDTO>> searchStudentsBylName(@PathVariable(value = "lname") String lname) {
        List<StudentsDTO> students2 = studentsService.searchStudentsBylName(lname);

        if (students2.isEmpty()) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(students2, HttpStatus.OK);
    }

    @GetMapping(value = "/students/{}/{fname}/{lname}/{town}/", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<StudentsDTO>> searchStudentsByTown(@PathVariable(value = "town") String town) {
        List<StudentsDTO> students3 = studentsService.searchStudentsByTown(town);

        if (students3.isEmpty()) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

        }
        return new ResponseEntity<>(students3, HttpStatus.OK);
    }


    @RequestMapping(value = "/removeStudents", method = {RequestMethod.DELETE, RequestMethod.POST})
    public ResponseEntity<List<StudentsDTO>> removeStudents(@RequestParam(value = "id") Long id
    ) {         studentsService.removeStudentsById(id);
        return new ResponseEntity<>(studentsService.getAllStudents(), HttpStatus.OK);
    }

    @PostMapping(value = "/createStudents")
    public ResponseEntity<List<StudentsDTO>> createStudents (@RequestParam (value = "fname") String fname,
                                                             @RequestParam (value = "lname") String lname,
                                                             @RequestParam(value = "town") String town, Students students) {
        studentsService.saveStudents(students);
        return new ResponseEntity<>(studentsService.getAllStudents(), HttpStatus.OK);

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


