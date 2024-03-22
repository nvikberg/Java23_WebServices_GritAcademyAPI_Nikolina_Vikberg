package com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class CoursesController {


    String message = "Not found";
    @Autowired
    CoursesService coursesService;


    //see all courses and its students
    @GetMapping(value = "/courses/", produces = MediaType.APPLICATION_JSON_VALUE)
    List<CoursesDTO> getAllCourses() {
        return coursesService.getAllCourses();
    }

    //search by course id
    @GetMapping(value = "/courses/{id}/", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<CoursesDTO>> getStudentsForCourses(@PathVariable(value = "id") Long id) {
        List<CoursesDTO> courses = coursesService.getStudentsForCourses(id);
        if (id < 1) {
            throw new InvalidRequestHandler("Id was not found " + id);
        }
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }

    //search by course name
    @GetMapping(value = "/courses/{}/{name}/", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<CoursesDTO>> searchCoursesByNameContaining(@PathVariable(value = "name") String name) {
        List<CoursesDTO> courses1 = coursesService.searchCoursesByNameContaining(name);
        if (courses1.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No courses with name" + name + " was found");
        }
        return new ResponseEntity<>(courses1, HttpStatus.OK);
    }

    //search for course by description
    @GetMapping(value = "/courses/{}/{name}/{description}/", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<CoursesDTO>> searchByDescriptionContaining(@PathVariable(value = "description") String description) {
        List<CoursesDTO> courses3 = coursesService.searchByDescriptionContaining(description);
        if (courses3.isEmpty()) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(courses3, HttpStatus.OK);
    }

    //deleting course by id
    @RequestMapping(value = "/removeCourses", method = {RequestMethod.DELETE, RequestMethod.POST})
    public ResponseEntity<List<CoursesDTO>> removeCourses(@RequestParam(value = "id") Long id
    ) {         coursesService.removeCoursesById(id);
        return new ResponseEntity<>(coursesService.getAllCourses(), HttpStatus.OK);
    }

    @PostMapping(value = "/createCourses")
    public ResponseEntity<List<CoursesDTO>> createCourses (@RequestParam (value = "name") String name,
                                                           @RequestParam (value = "points") String points,
                                                           @RequestParam(value = "description") String description, Courses courses) {
        coursesService.saveCourses(courses);
        return new ResponseEntity<>(coursesService.getAllCourses(), HttpStatus.OK);
    }
}
 //response entity is representing the whole HTTP response and omvanbldar datan, används för data