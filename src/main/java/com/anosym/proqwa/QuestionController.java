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
public class QuestionController implements Serializable {

    private String questionTitle;

    @PostConstruct
    void init() {
        questionTitle = getQuestionTitle();
    }

    public String getQuestionTitle() {
        return "new-question-on-health-bm-quest89898998";
    }

    public String toQuestionView() {
        return "pretty:question";
    }
}
