package com.example.springsoftwaremanagement;

import com.example.springsoftwaremanagement.entity.Software;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Library extends Software {
    @ManyToMany
    @JoinTable(name = "null_libraries",
            joinColumns = @JoinColumn(name = "library_1_id"),
            inverseJoinColumns = @JoinColumn(name = "libraries_2_id"))
    private Set<Library> libraries = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Library library = (Library) o;
        return getId() != null && Objects.equals(getId(), library.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}