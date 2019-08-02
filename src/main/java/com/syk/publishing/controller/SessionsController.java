package com.syk.publishing.controller;

import com.syk.publishing.common.api.CommonResult;
import com.syk.publishing.mbg.model.Sessions;
import com.syk.publishing.service.SessionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: shaoyikun
 * @Date: 2019-08-02
 * @Description:
 **/
@Api(tags = "Sessions Controller", description = "Sessions Controller api")
@Controller
@RequestMapping(value = "/web/sessions")
public class SessionsController {

    @Autowired
    private SessionService sessionService;

    @ApiOperation("List all sessions")
    @GetMapping(value = "listAll")
    @ResponseBody
    public CommonResult<List<Sessions>> listAll() {
        return CommonResult.success(sessionService.listSessions());
    }

    @ApiOperation("Get session by id")
    @GetMapping(value = "getById")
    @ResponseBody
    public CommonResult<Sessions> getById(@RequestParam("id") Long id) {
        return CommonResult.success(sessionService.getSessionById(id));
    }
}
