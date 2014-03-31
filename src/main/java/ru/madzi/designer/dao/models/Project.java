package ru.madzi.designer.dao.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the projects database table.
 * 
 */
@Entity
@Table(name="projects")
@NamedQuery(name="Project.findAll", query="SELECT p FROM Project p")
public class Project implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Long uid;

    private String description;

    private String name;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    public Project() {
    }

    public Long getUid() {
        return this.uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
