package com.syk.publishing.service.impl;

import com.syk.publishing.common.tools.FastDFS.FastDFSClient;
import com.syk.publishing.common.tools.FastDFS.FastDFSFile;
import com.syk.publishing.mbg.model.File;
import com.syk.publishing.service.UploadService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class UploadServiceImpl implements UploadService {
    private static Logger logger = LoggerFactory.getLogger(UploadServiceImpl.class);
    /**
     * @param multipartFiles
     * @return
     * @throws IOException
     */
    public List<File> saveFile(MultipartFile[] multipartFiles) throws IOException {
        List<File> files = new ArrayList<File>();

        for(int i = 0; i< multipartFiles.length;i++) {
            String[] fileAbsolutePath={};
            String fileName=multipartFiles[i].getOriginalFilename();
            String ext = fileName.substring(fileName.lastIndexOf(".") + 1);
            byte[] file_buff = null;
            InputStream inputStream=multipartFiles[i].getInputStream();
            if(inputStream!=null){
                int len1 = inputStream.available();
                file_buff = new byte[len1];
                inputStream.read(file_buff);
            }
            inputStream.close();
            FastDFSFile file = new FastDFSFile();
            file.setName(fileName);
            file.setContent(file_buff);
            file.setExt(ext);

            try {
                fileAbsolutePath = FastDFSClient.upload(file);  //upload to fastdfs
            } catch (Exception e) {
                logger.error("upload file Exception!",e);
            }
            if (fileAbsolutePath==null) {
                logger.error("upload file failed,please upload again!");
            }
            String path=FastDFSClient.getTrackerUrl()+fileAbsolutePath[0]+ "/"+fileAbsolutePath[1];

            File result = new File();
            result.setFileurl(path);
            result.setGroupname(fileAbsolutePath[0]);
            result.setFilename(fileAbsolutePath[1]);
            result.setType("pic");

            files.add(result);
        }

        return files;
    }

    @Override
    public void deleteFile(File file) throws Exception {
        FastDFSClient.deleteFile(file.getGroupname(),file.getFilename());
    }
}
