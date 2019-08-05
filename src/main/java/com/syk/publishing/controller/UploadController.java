package com.syk.publishing.controller;

import com.syk.publishing.common.api.CommonResult;
import com.syk.publishing.common.api.RichTextEditorPicUploadResult;
import com.syk.publishing.mbg.model.File;
import com.syk.publishing.service.FileService;
import com.syk.publishing.service.UploadService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: shaoyikun
 * @Date: 2019-07-31
 * @Description:
 **/
@Api(tags = "UploadController",description = "Upload api")
@RestController
@RequestMapping(value = "/web/uploader")
public class UploadController {

    @Autowired
    private UploadService uploadService;

    @Autowired
    private FileService fileService;

    @ApiOperation("Upload files")
    @ResponseBody
    @PostMapping(value = "upload")
    public CommonResult<List<File>> upload(@RequestParam("files") MultipartFile[] files) throws IOException {
        if (files.length == 0) {
            return CommonResult.failed("Upload failed");
        }

        else {
            List<File> result = uploadService.saveFile(files);
            fileService.addFiles(result);
            for(int i = 0; i < result.size(); i++) {
                File temp = fileService.getFileByName(result.get(i).getFilename()).get(0);
                result.get(i).setFileId(temp.getFileId());
            }
            return CommonResult.success(result);
        }
    }

    @ApiOperation("Upload pictures for rich text editor and return results in a specific format")
    @ResponseBody
    @PostMapping(value = "uploadPic")
    public RichTextEditorPicUploadResult uploadPic(@RequestParam("files") MultipartFile[] files) throws IOException {
        if (files.length == 0) {
            RichTextEditorPicUploadResult result = new RichTextEditorPicUploadResult();
            result.setErrno(1);
            return result;
        }
        else {
            List<File> temp = uploadService.saveFile(files);
            fileService.addFiles(temp);
            RichTextEditorPicUploadResult result = new RichTextEditorPicUploadResult();
            result.setErrno(0);
            List<String> url = new ArrayList<String>();
            for(int i = 0; i < temp.size(); i++) {
                url.add(temp.get(i).getFileurl());
            }
            result.setData(url);

            return result;
        }
    }

    @ApiOperation("Delete files")
    @ResponseBody
    @PostMapping(value = "delete")
    public CommonResult delete(@RequestBody File file) throws Exception {
        uploadService.deleteFile(file);
        fileService.deleteFile(file.getFileId());
        return CommonResult.success(null,"Delete success");
    }
}
