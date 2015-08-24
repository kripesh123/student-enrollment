/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.studentenroll.dao;

import java.util.List;

/**
 *
 * @author Sanjay
 */
public interface GenericDAO <T>{
    
    List<T>getAll();
    int insert(T t);
    int update(T t);
    int delete(int id);
}
