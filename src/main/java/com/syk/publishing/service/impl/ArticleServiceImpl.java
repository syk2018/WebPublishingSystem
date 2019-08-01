package com.syk.publishing.service.impl;

import com.github.pagehelper.PageHelper;
import com.syk.publishing.mbg.mapper.ArticleMapper;
import com.syk.publishing.mbg.model.Article;
import com.syk.publishing.mbg.model.ArticleExample;
import com.syk.publishing.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author: shaoyikun
 * @Date: 2019-08-01
 * @Description:
 **/
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public List<Article> listArticleBySessions(Long id, int pageNum, int pageSize) {
        ArticleExample articleExample = new ArticleExample();
        articleExample.setOrderByClause("articleId DESC");
        articleExample.createCriteria().andArticlesessionidEqualTo(id);
        PageHelper.startPage(pageNum,pageSize);
        List<Article> list = articleMapper.selectByExampleWithBLOBs(articleExample);
        return list;
    }

    @Override
    public List<Article> listAllArticle(int pageNum, int pageSize) {
        ArticleExample articleExample = new ArticleExample();
        articleExample.setOrderByClause("articleId DESC");
        PageHelper.startPage(pageNum,pageSize);
        List<Article> list = articleMapper.selectByExampleWithBLOBs(articleExample);
        return list;
    }

    @Override
    public Article getArticle(Long id) {
        return articleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addArticle(Article article) {
        article.setArticleclickcount(0);
        article.setArticlelastcommenttime(new Date());
        article.setArticletime(new Date());
        article.setArticleconsentient(1);
        return articleMapper.insertSelective(article);
    }

    @Override
    public int deleteArticle(Long id) {
        return articleMapper.deleteByPrimaryKey(id);
    }
}
