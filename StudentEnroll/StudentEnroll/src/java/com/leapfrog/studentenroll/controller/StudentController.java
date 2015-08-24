/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.studentenroll.controller;

import com.leapfrog.studentenroll.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Admin
 */
@Controller
@RequestMapping(value = "admin/Student")
public class StudentController {
    
    @Autowired
    private StudentService sService;
    
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView index(){
        ModelAndView mv=new ModelAndView("/admin/student/index");
        mv.addObject("students", sService.getAll());
        return mv;
    }
    
}
