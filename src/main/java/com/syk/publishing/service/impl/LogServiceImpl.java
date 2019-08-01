package com.syk.publishing.service.impl;

import com.syk.publishing.mbg.mapper.LogMapper;
import com.syk.publishing.mbg.model.Log;
import com.syk.publishing.mbg.model.LogExample;
import com.syk.publishing.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author: shaoyikun
 * @Date: 2019-07-31
 * @Description:
 **/
@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogMapper logMapper;

    @Override
    public int addLog(Log log) {
        return logMapper.insertSelective(log);
    }

    @Override
    public List<Log> listLogByUserId(Long userId) {
        LogExample logExample = new LogExample();
        logExample.createCriteria().andUserIdEqualTo(userId);
        return logMapper.selectByExample(logExample);
    }

    public String getIp(HttpServletRequest request) {
        String ip;

        ip = request.getHeader("x-forwarded-for");
        if (ip != null && ip.length() != 0 && !"unknown".equalsIgnoreCase(ip)) {
            if( ip.indexOf(",")!=-1 ){
                ip = ip.split(",")[0];
            }
        }

        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }

        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }

        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }

        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }

        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("X-Real-IP");
        }

        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }

        return ip;
    }
}
