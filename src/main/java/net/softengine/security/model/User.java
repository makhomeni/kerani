package net.softengine.security.model;

import javax.persistence.*;

/**
 * package net.softengine.security.model;
 * Copyright (C) 2002-2003 Soft Engine Inc.
 * <p/>
 * Original author: Khomeni
 * Date: 12/08/2015} 5:26 PM
 * Last modification by: Khomeni:
 * Last modification on 12.08.2015:
 * Current revision: 1.0:
 * <p/>
 * Revision History:
 * ------------------
 */

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "user_type", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("admin")
@Table(name = "AD_USER_MASTER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

    private boolean active;

    @OneToOne
    private Token token;

    @ManyToOne
    private Group group;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
