package com.syk.publishing.service;

import com.syk.publishing.mbg.model.File;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface UploadService {

    File saveFile(MultipartFile multipartFile) throws IOException;

    void deleteFile(File file) throws Exception;
}
