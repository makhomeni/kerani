package net.softengine.security.service;

import net.softengine.security.dao.GroupDAO;
import net.softengine.security.dao.UserDao;
import net.softengine.security.model.Group;
import net.softengine.security.model.Token;
import net.softengine.security.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * package net.softengine.security.service;
 * Copyright (C) 2002-2003 Soft Engine Inc.
 * <p/>
 * Original author: Khomeni
 * Date: 12/08/2015} 6:01 PM
 * Last modification by: Khomeni:
 * Last modification on 12.08.2015:
 * Current revision: 1.0:
 * <p/>
 * Revision History:
 * ------------------
 */
@Service
public class SecurityServiceImpl implements SecurityService {
    @Autowired
    public UserDao userDao;

    @Autowired
    public GroupDAO groupDAO;

    @Override
    public boolean save(Group group) {
        return groupDAO.save(group);
    }

    @Override
    public boolean update(Group group) {
        return false;
    }

    @Override
    public boolean delete(Group group) {
        return false;
    }

    @Override
    public List<Group> findAllGroup() {
        return null;
    }

    @Override
    public Group getGroup(Long id) {
        return groupDAO.getGroup(id);
    }

    @Override
    public boolean save(User user) {
        return userDao.save(user);
    }

    @Override
    public boolean save(Token token) {
        return false;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public boolean update(Token token) {
        return false;
    }

    @Override
    public boolean delete(User user) {
        return false;
    }

    @Override
    public boolean delete(Token token) {
        return false;
    }

    @Override
    public User get(Long userID) {
        return userDao.get(userID);
    }

    @Override
    public User get(String username) {
        return null;
    }

    @Override
    public User get(String username, String password) {
        return null;
    }
}
