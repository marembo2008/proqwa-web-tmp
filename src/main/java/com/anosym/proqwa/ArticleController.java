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
public class ArticleController implements Serializable {

    private String articleTitle;

    @PostConstruct
    void init() {
        articleTitle = getArticleTitle();
    }

    public String getArticleTitle() {
        return "new-article-about-me-bm-art9898989";
    }

    public String toArticleView() {
        return "pretty:article";
    }
}
