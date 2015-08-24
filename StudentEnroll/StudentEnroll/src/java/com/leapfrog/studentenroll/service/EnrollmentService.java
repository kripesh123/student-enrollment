/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.studentenroll.service;

import com.leapfrog.studentenroll.dao.EnrollmentDAO;
import com.leapfrog.studentenroll.entity.Enrollment;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class EnrollmentService {
    
    @Autowired
     EnrollmentDAO edao;
    
    public int insert(Enrollment enrollment){
        return edao.insert(enrollment);
    }
    public int update(Enrollment enrollment){
        return edao.update(enrollment);
    }
    public int delete(int id){
        return edao.delete(id);
    }
    public List<Enrollment>getAll(){
        return edao.getAll();
    }
    public Enrollment getByEnrollmentId(int enrollmentId){
        return edao.getByEnrollmentId(enrollmentId);
    }
    public Enrollment getByStudentId(int studentId){
        return edao.getByStudentId(studentId);
    }
    public Enrollment getByCourseId(int courseId){
        return edao.getByCourseId(courseId);
    }
}
