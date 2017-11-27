/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app2.dao;

import com.app2.dao.model.User;

/**
 *
 * @author Harindu.sul
 */
public interface UserDAO extends SuperDAO<User>{
    public User getUserByUserName(String name) throws Exception;
}
