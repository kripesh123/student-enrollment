/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.studentenroll.service;

import com.leapfrog.studentenroll.dao.CourseDAO;
import com.leapfrog.studentenroll.entity.Course;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class CourseService {
    
    @Autowired
     CourseDAO cdao;
    
    public int insert(Course course){
        return cdao.insert(course);
    }
    public int update(Course course){
        return cdao.update(course);
    }
    public int delete(int id){
        return cdao.delete(id);
    }
    public List<Course>getAll(){
        return cdao.getAll();
    }
    public Course getByCourseId(int courseId){
        return cdao.getByCourseId(courseId);
    }
}
