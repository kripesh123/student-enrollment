/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.studentenroll.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Sanjay
 */
@Entity
@Table(name = "course")
public class Course implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private int courseId;
    @Column(name = "course_name")
    private String courseName;
    @Column(name = "course_description")
    private String courseDescription;
    @Column(name = "course_fee")
    private float courseFee;
    @Column(name = "course_duration")
    private int courseDuration;
    @Column(name = "course_duration_type")
    private String corseDurationType;

    public Course() {
    }

    public Course(int courseId, String courseName, String courseDescription, float courseFee, int courseDuration, String corseDurationType) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseFee = courseFee;
        this.courseDuration = courseDuration;
        this.corseDurationType = corseDurationType;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public float getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(float courseFee) {
        this.courseFee = courseFee;
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getCorseDurationType() {
        return corseDurationType;
    }

    public void setCorseDurationType(String corseDurationType) {
        this.corseDurationType = corseDurationType;
    }

    @Override
    public String toString() {
        return "Course{" + "courseId=" + courseId + ", courseName=" + courseName + ", courseDescription=" + courseDescription + ", courseFee=" + courseFee + ", courseDuration=" + courseDuration + ", corseDurationType=" + corseDurationType + '}';
    }

}
