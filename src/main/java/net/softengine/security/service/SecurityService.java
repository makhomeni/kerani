package net.softengine.security.service;

import net.softengine.security.model.Group;
import net.softengine.security.model.Token;
import net.softengine.security.model.User;

import java.util.List;

/**
 * Created by core-khomeni on 12/08/2015.
 */
public interface SecurityService {

    public boolean save(Group group);

    public boolean update(Group group);

    public boolean delete(Group group);

    public List<Group> findAllGroup();

    public Group getGroup(Long id);


    public boolean save(User user);

    public boolean save(Token token);

    public boolean update(User user);

    public boolean update(Token token);

    public boolean delete(User user);

    public boolean delete(Token token);

    public User get(Long userID);

    public User get(String username);

    public User get(String username, String password);
}
