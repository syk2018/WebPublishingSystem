package com.syk.publishing.controller;

import com.syk.publishing.common.api.CommonPage;
import com.syk.publishing.common.api.CommonResult;
import com.syk.publishing.mbg.model.Article;
import com.syk.publishing.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: shaoyikun
 * @Date: 2019-08-01
 * @Description:
 **/
@Api(tags = "ArticleController", description = "Article controller api")
@Controller
@RequestMapping(value = "/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @ApiOperation("Add article")
    @PostMapping(value = "add")
    @ResponseBody
    public CommonResult<Article> addArticle(@RequestBody Article article) {
        this.articleService.addArticle(article);
        return CommonResult.success(article);
    }

    @ApiOperation("Get article by id")
    @GetMapping(value = "getById")
    @ResponseBody
    public CommonResult<Article> getArticleById(@RequestParam("id") Long id) {
        return CommonResult.success(articleService.getArticle(id));
    }

    @ApiOperation("List articles by session")
    @GetMapping(value = "listBySession")
    @ResponseBody
    public CommonResult<CommonPage<Article>> listBySession(@RequestParam("id") Long id,
                                                           @RequestParam("pageNum") int pageNum,
                                                           @RequestParam("pageSize") int pageSize) {
        List<Article> result = articleService.listArticleBySessions(id,pageNum,pageSize);
        return CommonResult.success(CommonPage.restPage(result));
    }

    @ApiOperation("List all articles")
    @GetMapping(value = "list")
    @ResponseBody
    public CommonResult<CommonPage<Article>> listAll(@RequestParam("pageNum") int pageNum,
                                               @RequestParam("pageSize") int pageSize) {
        List<Article> result = articleService.listAllArticle(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(result));
    }
}
