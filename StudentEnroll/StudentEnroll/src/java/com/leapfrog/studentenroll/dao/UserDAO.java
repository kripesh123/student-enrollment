/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.studentenroll.dao;

import com.leapfrog.studentenroll.entity.User;

/**
 *
 * @author Sanjay
 */
public interface UserDAO extends GenericDAO<User>{
    
    User authenticate(String username, String password);
    User getUserById(int userId);
}
