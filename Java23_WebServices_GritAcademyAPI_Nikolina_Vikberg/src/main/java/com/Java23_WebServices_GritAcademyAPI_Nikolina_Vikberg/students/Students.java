package com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.students;

import com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.courses.Courses;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity (name = "students")
@Table (name = "students")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "fname")
    private String fname;

    @Column(name = "lname")
    private String lname;

    @Column(name = "town")
    private String town;

    @ManyToMany(fetch = FetchType.LAZY, cascade =
            CascadeType.ALL)
    @JoinTable(
            name = "students_courses",
            joinColumns = @JoinColumn(name = "students_id"),
            inverseJoinColumns = @JoinColumn(name = "courses_id")
    )
    private Set<Courses> courses = new HashSet<>();

}
