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
@Table(name = "payment")
public class Payment implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private int paymentId;
    @Column(name = "enrollment_id")
    private int enrollmentId;
    @Column(name = "paid")
    private float paid;
    @Column(name = "remain")
    private float remain;

    public Payment() {
    }

    public Payment(int paymentId, int enrollmentId, float paid, float remain) {
        this.paymentId = paymentId;
        this.enrollmentId = enrollmentId;
        this.paid = paid;
        this.remain = remain;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(int enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public float getPaid() {
        return paid;
    }

    public void setPaid(float paid) {
        this.paid = paid;
    }

    public float getRemain() {
        return remain;
    }

    public void setRemain(float remain) {
        this.remain = remain;
    }

    @Override
    public String toString() {
        return "Payment{" + "paymentId=" + paymentId + ", enrollmentId=" + enrollmentId + ", paid=" + paid + ", remain=" + remain + '}';
    }
    
    
}
