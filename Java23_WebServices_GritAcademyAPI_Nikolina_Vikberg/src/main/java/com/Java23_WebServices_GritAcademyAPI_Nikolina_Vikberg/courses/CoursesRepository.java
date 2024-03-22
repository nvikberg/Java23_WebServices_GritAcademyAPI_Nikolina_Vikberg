package com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.courses;

import lombok.Getter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CoursesRepository extends JpaRepository<Courses, Long> {

    List<Courses> findAll();

    List<Courses> findByNameContaining(String name);


   // List<Courses> findByNameContaining(String keyword);

    void deleteById(Long id);


    Optional<Courses> findById(Long courses_id);
}