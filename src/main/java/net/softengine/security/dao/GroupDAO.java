package net.softengine.security.dao;


import net.softengine.security.model.Group;

import java.util.List;

public interface GroupDAO {
    public boolean save(Group group);

    public boolean update(Group group);

    public boolean delete(Group group);

    public List<Group> findAllGroup();

    public Group getGroup(Long id);

}
