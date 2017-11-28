/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app2.service;

import com.app2.dto.UserDTO;

/**
 *
 * @author Harindu.sul
 */
public interface UserService extends SuperService<UserDTO>{
    public UserDTO getUserByUserName(String name) throws Exception;
}
