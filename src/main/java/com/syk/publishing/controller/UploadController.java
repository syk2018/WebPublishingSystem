package com.syk.publishing.controller;

import com.syk.publishing.common.api.CommonResult;
import com.syk.publishing.mbg.model.File;
import com.syk.publishing.service.FileService;
import com.syk.publishing.service.UploadService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author: shaoyikun
 * @Date: 2019-07-31
 * @Description:
 **/
@Api(tags = "UploadController",description = "Upload api")
@RestController
@RequestMapping(value = "/uploader")
public class UploadController {

    @Autowired
    private UploadService uploadService;

    @Autowired
    private FileService fileService;

    @ApiOperation("Upload files")
    @ResponseBody
    @PostMapping(value = "upload")
    public CommonResult<File> upload(@RequestParam("file") MultipartFile file) throws IOException {
        if (file.isEmpty()) {
            return CommonResult.failed("Upload failed");
        }

        else {
            File result = uploadService.saveFile(file);
            fileService.addFile(result);
            return CommonResult.success(result);
        }
    }

    @ApiOperation("Delete files")
    @ResponseBody
    @PostMapping(value = "delete")
    public CommonResult delete(@RequestBody File file) throws Exception {
        uploadService.deleteFile(file);
        fileService.deleteFile(file.getFileId());
        return CommonResult.success(null,"Upload success");
    }
}
