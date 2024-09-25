package com.upc.pre.peaceapp.models;

import com.upc.pre.peaceapp.shared.documentation.models.AuditableAbstractAggregateRoot;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class UserProfile extends AuditableAbstractAggregateRoot<UserProfile> {
    private String name;
    private String email;
    private String password;
    private String lastname;
    private String phonenumber;

    public UserProfile() {
        this.name = "";
        this.email = "";
        this.password = "";
        this.lastname = "";
        this.phonenumber = "";
    }

    public UserProfile(String name, String email, String password, String lastname, String phonenumber) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
    }
}
