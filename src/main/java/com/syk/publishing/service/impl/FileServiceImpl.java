package com.syk.publishing.service.impl;

import com.syk.publishing.mbg.mapper.FileMapper;
import com.syk.publishing.mbg.model.File;
import com.syk.publishing.mbg.model.FileExample;
import com.syk.publishing.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: shaoyikun
 * @Date: 2019-07-31
 * @Description:
 **/

@Service
public class FileServiceImpl implements FileService {

    @Autowired
    private FileMapper fileMapper;

    @Override
    public File getFileById(Long id) {
        return fileMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addFile(File file) {
        return fileMapper.insertSelective(file);
    }

    @Override
    public int deleteFile(Long id) {
        return fileMapper.deleteByPrimaryKey(id);
    }
}
