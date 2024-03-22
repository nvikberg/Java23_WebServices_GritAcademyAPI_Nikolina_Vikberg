package com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.students;

import com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.courses.Courses;
import com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.courses.CoursesDTO;
import com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.courses.CoursesRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Service
public class StudentsService {

    @Autowired
    StudentsRepository studentsRepository;
    CoursesRepository coursesRepository;

    public List<StudentsDTO> getAllStudents() {
        List<StudentsDTO> studentsDTO = new ArrayList<>();
        studentsRepository.findAll().forEach(students -> studentsDTO.add(this.mapToDTO(students)));
        return studentsDTO;
    }

    public List<StudentsDTO> getCoursesForStudents(Long id) {
        Optional<Students> students = studentsRepository.findById(id).map(students1 -> {
            students1.getCourses().size();
            return students1;
        });
        return students.stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());

    }

    //method for searching fname and lname
    public List<StudentsDTO> searchStudentsByfName(String fname) {
        List<Students> studentsList = studentsRepository.findByFname(fname);
        return studentsList.stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    public List<StudentsDTO> searchStudentsBylName(String lname) {
        List<Students> studentsList2 = studentsRepository.findByLname(lname);
        return studentsList2.stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    public List<StudentsDTO> searchStudentsByTown(String town) {
        List<Students> studentsList3 = studentsRepository.findByTown(town);
        return studentsList3.stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    public void saveStudents(Students students) {
        studentsRepository.save(students);
    }

    public void removeStudentsById(Long id) {
        studentsRepository.deleteById(id);
    }

    /*
    public List<StudentsDTO> addStudentsToCourses(Long students_id, Long courses_id) {
        List<StudentsDTO> studentsDTO = new ArrayList<>();
        Students students = studentsRepository.findById(students_id)
                .orElseThrow(() -> new NoSuchElementException("Student not found with id " + students_id));
            Courses courses = coursesRepository.findById(courses_id)
                .orElseThrow(() -> new NoSuchElementException("Course not found with id  " + courses_id));
        students.getCourses().add(courses);
        studentsRepository.save(students);
        studentsDTO.add(mapToDTO(students));
        return studentsDTO;
    }


     */

    private CoursesDTO mapToDTO(Courses courses) {
        CoursesDTO dto = new CoursesDTO();
        dto.setId(courses.getId());
        dto.setName(courses.getName());
        dto.setDescription(courses.getDescription());

        return dto;
    }
    private StudentsDTO mapToDTO(Students students) {
        StudentsDTO dto = new StudentsDTO();
        dto.setId(students.getId());
        dto.setFname(students.getFname());
        dto.setLname(students.getLname());
        dto.setTown(students.getTown());
        dto.setCourses(students.getCourses().stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList()));
        return dto;
    }

}

