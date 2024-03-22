package com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.courses;

import com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.students.Students;
import com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.students.StudentsDTO;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Data
public class CoursesService {

    @Autowired
    CoursesRepository coursesRepository;


    public List<CoursesDTO> getAllCourses() {
        List<CoursesDTO> coursesDTO = new ArrayList<>();
        coursesRepository.findAll().forEach(courses -> coursesDTO.add(this.mapToDTO(courses)));
        return coursesDTO;
    }

    public List<CoursesDTO> getStudentsForCourses(Long id) {
        Optional<Courses> courses = coursesRepository.findById(id).map(courses1 -> {
            courses1.getStudents().size();
            return courses1;
        });
        return courses.stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    public List<CoursesDTO> searchCoursesByNameContaining(String name) {
        List<Courses> coursesList = coursesRepository.findByNameContaining(name);
        return coursesList.stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    public List<CoursesDTO> searchByDescriptionContaining(String description) {
        List<Courses> coursesList3 = coursesRepository.findByNameContaining(description);
        return coursesList3.stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    public Courses saveCourses(Courses courses) {
        return coursesRepository.save(courses);
    }

    public void removeCoursesById(Long id) {
        coursesRepository.deleteById(id);
    }




    private StudentsDTO mapToDTO(Students students) {
            StudentsDTO dto = new StudentsDTO();
            dto.setId(students.getId());
            dto.setFname(students.getFname());
            dto.setLname(students.getLname());

            return dto;
        }
        private CoursesDTO mapToDTO(Courses courses) {
            CoursesDTO dto = new CoursesDTO();
            dto.setId(courses.getId());
            dto.setName(courses.getName());
            dto.setPoints(courses.getPoints());
            dto.setDescription(courses.getDescription());
            dto.setStudents(courses.getStudents().stream()
                    .map(this::mapToDTO)
                    .collect(Collectors.toList()));
            return dto;
        }


}

