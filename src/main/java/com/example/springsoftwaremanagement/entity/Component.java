package com.example.springsoftwaremanagement;

import com.example.springsoftwaremanagement.converter.VersionConverter;
import com.example.springsoftwaremanagement.entity.License;
import com.example.springsoftwaremanagement.entity.Version;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.net.URL;
import java.util.LinkedHashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class Component {
    @Column(name = "code")
    private String code;
    @Column(name = "version")
    @Convert(converter = VersionConverter.class)
    private Version version;
    @Column(name = "description")
    private String description;
    @Column(name = "url")
    URL url;

    @ManyToMany
    private Set<License> licences = new LinkedHashSet<>();

}