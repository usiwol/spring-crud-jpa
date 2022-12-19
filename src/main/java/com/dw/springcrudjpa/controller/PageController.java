package com.dw.springcrudjpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    
    @GetMapping("/student")
    public String loadStudentPage() {
        return "student";
    }
@GetMapping("/curriculum")
    public String loadCurriculumPage() {
        return "curriculum";
    }
    
}
