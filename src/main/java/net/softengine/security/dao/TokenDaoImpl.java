package net.softengine.security.dao;


import net.softengine.security.model.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * package net.softengine.security;
 * Copyright (C) 2002-2003 Soft Engine Inc.
 * <p/>
 * Original author: Khomeni
 * Date: 12/08/2015 5:02 PM
 * Last modification by: Khomeni:
 * Last modification on 12.08.2015:
 * Current revision: 1.0:
 * <p/>
 * Revision History:
 * ------------------
 */
@Repository
public class TokenDaoImpl implements TokenDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean save(Token token) {
        try {
            hibernateTemplate.persist(token);
            hibernateTemplate.flush();
            return true;
        } catch (Exception ex){
            return false;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean update(Token token) {
        hibernateTemplate.merge(token);
        hibernateTemplate.flush();
        return true;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean delete(Token token) {
        hibernateTemplate.delete(token);
        hibernateTemplate.flush();
        return true;
    }

    @Override
    public List<Token> findAllToken() {
        return hibernateTemplate.find("from Token");
    }

    @Override
    public Token getToken(Long id) {
        return hibernateTemplate.get(Token.class, id);
    }
}
