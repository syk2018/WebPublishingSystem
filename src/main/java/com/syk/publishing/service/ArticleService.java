package com.syk.publishing.service;
import com.syk.publishing.mbg.model.Article;

import java.util.List;

public interface ArticleService {

    List<Article> listArticleBySessions(Long id, int pageNum, int pageSize);

    List<Article> listArticleBySessions(Long id);

    List<Article> listArticleByUserId(Long id);

    List<Article> listAllArticle(int pageNum, int pageSize);

    Article getArticle(Long id);

    int addArticle(Article article);

    int deleteArticle(Long id);
}
