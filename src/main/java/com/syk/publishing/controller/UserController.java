package com.syk.publishing.controller;

import com.syk.publishing.common.api.CommonResult;
import com.syk.publishing.common.api.ResultCode;
import com.syk.publishing.mbg.model.Users;
import com.syk.publishing.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: shaoyikun
 * @Date: 2019-07-30
 * @Description:
 **/
@Api(tags = "UsersController", description = "Users information api")
@Controller
@RequestMapping(value = "users")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation("Get user by id")
    @RequestMapping(value = "getUserById", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Users> getUserById(@RequestParam(value = "id")Long id) {
        return CommonResult.success(userService.getUserById(id));
    }

    @ApiOperation("Login")
    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<List<Users>> login(@RequestBody Users user) {
        List<Users> result = userService.login(user);
        if(!result.isEmpty()) {
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
}
