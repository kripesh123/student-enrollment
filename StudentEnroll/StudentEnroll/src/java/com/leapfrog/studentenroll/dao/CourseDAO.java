/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.studentenroll.dao;

import com.leapfrog.studentenroll.entity.Course;

/**
 *
 * @author Admin
 */
public interface CourseDAO extends GenericDAO<Course>{
    Course getByCourseId(int courseId);
}
