/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.studentenroll.dao;

import com.leapfrog.studentenroll.entity.Enrollment;

/**
 *
 * @author Admin
 */
public interface EnrollmentDAO extends GenericDAO<Enrollment>{
    Enrollment getByEnrollmentId(int enrollmentId);
    Enrollment getByCourseId(int courseId);
    Enrollment getByStudentId(int sudentId);
    
}
