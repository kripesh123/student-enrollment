/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.studentenroll.service;

import com.leapfrog.studentenroll.dao.PaymentDAO;
import com.leapfrog.studentenroll.entity.Payment;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class PaymentService {
    
    @Autowired
     PaymentDAO pdao;
    
    public int insert(Payment payment){
        return pdao.insert(payment);
    }
    public int update(Payment payment){
        return pdao.update(payment);
    }
    public int delete(int id){
        return pdao.delete(id);
    }
    public List<Payment>getAll(){
        return pdao.getAll();
    }
    public Payment getByPaymentId(int paymentId){
        return pdao.getByPaymentId(paymentId);
    }
    public Payment getByEnrollmentId(int enrollmentId){
        return pdao.getByEnrollmentId(enrollmentId);
    }
}
