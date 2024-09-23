package com.upc.pre.peaceapp.models;

import com.upc.pre.peaceapp.shared.documentation.models.AuditableAbstractAggregateRoot;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Entity
@Getter
public class UserAuth extends AuditableAbstractAggregateRoot<UserAuth> {
    @NotBlank
    @Size(max = 50)
    @Column(unique=true)
    private String email;

    @NotBlank
    @Size(max = 120)
    private String password;

    public UserAuth(String email, String password){
        this.email = email;
        this.password = password;
    }

    public UserAuth() {
        this.email = "";
        this.password = "";
    }
}
