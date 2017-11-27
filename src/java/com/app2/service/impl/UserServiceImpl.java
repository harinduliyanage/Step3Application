/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app2.service.impl;

import com.app2.dao.UserDAO;
import com.app2.dao.model.User;
import com.app2.dto.UserDTO;
import com.app2.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Harindu.sul
 */
public class UserServiceImpl implements UserService{
    
    @Autowired
    UserDAO userDAO;

    @Override
    public boolean add(UserDTO t) throws Exception {
        User u = new User();
        u.setUserName(t.getUserName());
        u.setAge(t.getAge());
        u.setPhone(t.getPhone());
        u.setAddress(t.getAddress());
        return userDAO.add(u);
    }

    @Override
    public boolean update(UserDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UserDTO search(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UserDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
