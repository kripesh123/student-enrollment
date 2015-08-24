/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.studentenroll.dao;

import com.leapfrog.studentenroll.entity.Payment;

/**
 *
 * @author Admin
 */
public interface PaymentDAO extends GenericDAO<Payment>{
    Payment getByPaymentId(int paymentId);
    Payment getByEnrollmentId(int enrollmentId);
}
