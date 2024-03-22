package com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Home {


    @GetMapping(value ="/")
    public ModelAndView home(Model model){
        ModelAndView mav = new ModelAndView("home");
        return mav;
    }

    @GetMapping(value ="/studentshome")
    public ModelAndView studentsHome(Model model){
        ModelAndView mavStudents = new ModelAndView("studentsHome");
        return mavStudents;
    }

    @GetMapping(value ="/courseshome")
    public ModelAndView coursesHome(Model model){
        ModelAndView mavCourses = new ModelAndView("coursesHome");
        return mavCourses;
    }
}

