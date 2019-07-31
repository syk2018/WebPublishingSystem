package com.syk.publishing.service;

import com.syk.publishing.mbg.model.Log;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface LogService {

    int addLog(Log log);

    List<Log> listLogByUserId(Long userId);

    String getIp(HttpServletRequest request);
}
