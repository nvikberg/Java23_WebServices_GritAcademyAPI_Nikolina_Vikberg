package com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.studentsCourses;

import com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.courses.Courses;
import com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.students.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface StudentsCoursesRepository extends JpaRepository <StudentsCourses, Long> {

    List<StudentsCourses> findAll();
}

    //Optional<StudentsCourses> save(Long id, Long students_id, Long courses_id);




   // void deleteById(Long id);


/*
  void save(Students students, Courses courses);
  //  void save(Students students, Courses courses);

*/
