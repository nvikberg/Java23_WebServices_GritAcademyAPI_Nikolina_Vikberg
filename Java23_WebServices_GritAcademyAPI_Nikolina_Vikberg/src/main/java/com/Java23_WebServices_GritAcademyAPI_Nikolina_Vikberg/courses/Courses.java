package com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.courses;

import com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.students.Students;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity (name = "courses")
@Table (name = "courses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Courses {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "points")
    private String points;

    @Column(name = "description")
    private String description;

    @ManyToMany(mappedBy = "courses")
    private Set<Students> students = new HashSet<>();

}
