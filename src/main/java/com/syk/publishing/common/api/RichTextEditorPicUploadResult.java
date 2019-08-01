package com.syk.publishing.common.api;

import java.util.List;

/**
 * @author: shaoyikun
 * @Date: 2019-07-31
 * @Description:
 **/
public class RichTextEditorPicUploadResult {

    private int errno;
    private List<String> data;

    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }
}
