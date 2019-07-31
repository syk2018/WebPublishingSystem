package com.syk.publishing.service;

import com.syk.publishing.mbg.model.File;

public interface FileService {

    File getFileById(Long id);

    int addFile(File file);

    int deleteFile(Long id);
}
