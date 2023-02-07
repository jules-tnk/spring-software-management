package com.example.springsoftwaremanagement.entity.idclass;

import com.example.springsoftwaremanagement.entity.Version;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode
public class LicenseKey implements Serializable {
    String name;
    Version version;
    String language;
}
