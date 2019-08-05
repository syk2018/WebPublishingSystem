package com.syk.publishing.controller;

import com.syk.publishing.common.api.CommonResult;
import com.syk.publishing.common.api.ResultCode;
import com.syk.publishing.mbg.model.Log;
import com.syk.publishing.mbg.model.Users;
import com.syk.publishing.service.LogService;
import com.syk.publishing.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author: shaoyikun
 * @Date: 2019-07-30
 * @Description:
 **/
@Api(tags = "UsersController", description = "Users information api")
@Controller
@RequestMapping(value = "/web/users")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private LogService logService;

    @ApiOperation("Get user by id")
    @RequestMapping(value = "getUserById", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Users> getUserById(@RequestParam(value = "id")Long id) {
        return CommonResult.success(userService.getUserById(id));
    }

    @ApiOperation("Login")
    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<List<Users>> login(@RequestBody Users user, HttpServletRequest request) {
        List<Users> result = userService.login(user);
        if(!result.isEmpty()) {
            Log log = new Log();
            log.setLoglastipadress(logService.getIp(request));
            log.setLogtime(new Date());
            log.setUserId(result.get(0).getUserId());
            logService.addLog(log);
            return CommonResult.success(result);
        }

        else {
            return CommonResult.validateFailed("Wrong account name or password.");
        }
    }

    @ApiOperation("SignUp")
    @RequestMapping(value = "signUp", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult signUp(@RequestBody Users user) {
        int result = userService.createUser(user);
        if(result == ResultCode.DUPLICATE.getCode()) {
            return CommonResult.duplicate("Duplicate username.");
        }
        else {
            List<Users> temp = userService.getUserByUsername(user);
            return CommonResult.success(temp);
        }
    }

    @ApiOperation("Update")
    @RequestMapping(value = "update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@RequestBody Users user) {
        this.userService.updateUserWithoutPwd(user.getUserId(),user);
        return CommonResult.success(this.userService.getUserById(user.getUserId()),"success");
    }

    @ApiOperation("GetAuthors")
    @PostMapping(value = "getAuthors")
    @ResponseBody
    public CommonResult<List<String>> getAuthors(@RequestBody List<Long> userId) {

        List<String> result = new ArrayList<String>();
        for(int i = 0; i < userId.size(); i++) {
            result.add(i,userService.getUserById(userId.get(i)).getUsernickname());
        }

        return CommonResult.success(result);
    }
}
