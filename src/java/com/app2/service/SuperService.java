/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app2.service;

import java.util.List;

/**
 *
 * @author Harindu.sul
 */
public interface SuperService <T>{
   
    public boolean add(T t) throws Exception;
    public boolean update(T t) throws Exception;
    public boolean delete(Integer id)throws Exception;
    public T search(Integer id)throws Exception;
    public List<T> getAll()throws Exception;

}