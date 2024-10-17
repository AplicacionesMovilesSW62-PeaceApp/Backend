package com.upc.pre.peaceapp.security.iam.interfaces.rest.transform;


import com.upc.pre.peaceapp.security.iam.domain.model.commands.SignInCommand;
import com.upc.pre.peaceapp.security.iam.interfaces.rest.resources.SignInResource;

public class SignInCommandFromResourceAssembler {
    public static SignInCommand toCommandFromResource(SignInResource signInResource) {
        return new SignInCommand(signInResource.username(), signInResource.password());
    }
}