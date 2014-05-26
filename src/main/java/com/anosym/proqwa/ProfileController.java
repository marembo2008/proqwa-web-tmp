/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anosym.proqwa;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author mochieng
 */
@Named
@SessionScoped
public class ProfileController implements Serializable {

    private String profileName;

    @PostConstruct
    void init() {
        profileName = getProfileName();
    }

    public String getProfileName() {
        return "marembo2008";
    }

    public String toProfileView() {
        return "pretty:profile";
    }
}
