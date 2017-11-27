/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app2.dao.impl;

import com.app2.dao.UserDAO;
import com.app2.dao.model.User;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Harindu.sul
 */
@Repository
public class UserDAOImpl implements UserDAO{

   @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean add(User t) throws Exception {
        Serializable save = sessionFactory.getCurrentSession().save(t);
        return (save != null);
    }

    @Override
    public boolean update(User t) throws Exception {
        sessionFactory.getCurrentSession().update(t);
        return true;
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        User search = (User) sessionFactory.getCurrentSession().load(User.class, id);
        if (search != null) {
            sessionFactory.getCurrentSession().delete(search);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public User search(Integer id) throws Exception {
        return (User) sessionFactory.getCurrentSession().load(User.class, id);
    }

    @Override
    public List<User> getAll() throws Exception {
        List<User> categorys = sessionFactory.getCurrentSession().createCriteria(User.class).list();
        return categorys;
    }

    @Override
    public User getUserByUserName(String name) throws Exception {
        Criteria c2 = sessionFactory.getCurrentSession().createCriteria(User.class);
        c2.add(Restrictions.eq("userName", name));
        c2.setMaxResults(1);
        User user = (User) c2.uniqueResult();
        return user;
    }
    
}
