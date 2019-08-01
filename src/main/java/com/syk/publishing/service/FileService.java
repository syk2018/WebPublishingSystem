package com.syk.publishing.service;

import com.syk.publishing.mbg.model.File;

import java.util.List;

public interface FileService {

    File getFileById(Long id);

    List<File> getFileByName(String name);

    int addFile(File file);

    int[] addFiles(List<File> files);

    int deleteFile(Long id);
}
