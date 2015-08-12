package net.softengine.security.dao;

import net.softengine.security.model.Group;
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
public class GroupDaoImpl implements GroupDAO {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean save(Group group) {
        try {
            hibernateTemplate.persist(group);
            hibernateTemplate.flush();
            return true;
        } catch (Exception ex){
            return false;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean update(Group group) {
        hibernateTemplate.merge(group);
        hibernateTemplate.flush();
        return true;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean delete(Group group) {
        hibernateTemplate.delete(group);
        hibernateTemplate.flush();
        return true;
    }

    @Override
    public List<Group> findAllGroup() {
        return hibernateTemplate.find("from AuthorizedGroups");
    }

    @Override
    public Group getGroup(Long id) {
        return hibernateTemplate.get(Group.class, id);
    }
}
