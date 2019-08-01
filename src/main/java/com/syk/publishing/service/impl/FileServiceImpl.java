package com.syk.publishing.service.impl;

import com.syk.publishing.mbg.mapper.FileMapper;
import com.syk.publishing.mbg.model.File;
import com.syk.publishing.mbg.model.FileExample;
import com.syk.publishing.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<File> getFileByName(String name) {
        FileExample fileExample = new FileExample();
        fileExample.createCriteria().andFilenameEqualTo(name);
        return fileMapper.selectByExample(fileExample);
    }

    @Override
    public int addFile(File file) {
        return fileMapper.insertSelective(file);
    }

    @Override
    public int[] addFiles(List<File> files) {
        int[] result = new int[files.size()];

        for(int i = 0; i< files.size(); i++) {
            result[i] = fileMapper.insertSelective(files.get(i));
        }

        return result;
    }

    @Override
    public int deleteFile(Long id) {
        return fileMapper.deleteByPrimaryKey(id);
    }
}
