package com.amigoscode;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;
import java.util.Objects;

@Entity
public class SoftwareEngineer {

    @Id
    private Integer id;
    private String name;
    private String techStack;

    public SoftwareEngineer() {}

    public SoftwareEngineer(Integer id, String name, String techStack) {
        this.id = id;
        this.name = name;
        this.techStack = techStack;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTechStack() {
        return techStack;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareEngineer that = (SoftwareEngineer) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getTechStack(), that.getTechStack());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getTechStack());
    }
}
