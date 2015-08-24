/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.studentenroll.service;

import com.leapfrog.studentenroll.dao.UserDAO;
import com.leapfrog.studentenroll.entity.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class UserService {
    
    @Autowired
     UserDAO udao;
    
    public int insert(User user){
        return udao.insert(user);
    }
    public int update(User user){
        return udao.update(user);
    }
    public int delete(int id){
        return udao.delete(id);
    }
    public List<User>getAll(){
        return udao.getAll();
    }
    public User getByUserId(int userId){
        return udao.getUserById(userId);
    }
    public User authenticate(String username,String password){
        return udao.authenticate(username, password);
    }
}
