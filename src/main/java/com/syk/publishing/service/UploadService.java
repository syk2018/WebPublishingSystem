package com.syk.publishing.service;

import com.syk.publishing.mbg.model.File;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface UploadService {

    List<File> saveFile(MultipartFile[] multipartFiles) throws IOException;

    void deleteFile(File file) throws Exception;
}
