package com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.students;

import com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.courses.Courses;
import lombok.Data;
import lombok.Getter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Indexed;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface StudentsRepository extends JpaRepository <Students, Long> {

    List<Students>findAll();

  //List<Students>findById(Long id);

    List<Students> findByFname(String fname);

    List<Students> findByLname(String lname);

    List<Students> findByTown(String town);

    void deleteById(Long id);


}
