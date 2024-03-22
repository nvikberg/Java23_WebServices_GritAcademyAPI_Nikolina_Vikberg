package com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.studentsCourses;

import com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.courses.Courses;
import com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.students.Students;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "students_courses")
@Table(name = "students_courses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentsCourses {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "students_id",
            referencedColumnName = "id")
    private Students students;
    @ManyToOne
    @JoinColumn(name = "courses_id",
            referencedColumnName = "id")
    private Courses courses;

    }
