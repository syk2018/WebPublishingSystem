package com.syk.publishing.controller;

import com.syk.publishing.common.api.CommonResult;
import com.syk.publishing.mbg.model.File;
import com.syk.publishing.service.FileService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author: shaoyikun
 * @Date: 2019-07-31
 * @Description:
 **/
@Api(tags = "FileController", description = "File controller api")
@Controller
@RequestMapping(value = "/file")
public class FileController {

    @Autowired
    private FileService fileService;

    @ApiOperation("Get file by id")
    @GetMapping(value = "getById")
    @ResponseBody
    public CommonResult<File> getById(@RequestParam("id") Long id) {
        return CommonResult.success(fileService.getFileById(id));
    }

}
