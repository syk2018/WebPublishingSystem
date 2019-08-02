package com.syk.publishing.service.impl;

import com.syk.publishing.mbg.mapper.SessionsMapper;
import com.syk.publishing.mbg.model.Sessions;
import com.syk.publishing.mbg.model.SessionsExample;
import com.syk.publishing.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: shaoyikun
 * @Date: 2019-08-02
 * @Description:
 **/
@Service
public class SessionServiceImpl implements SessionService {

    @Autowired
    private SessionsMapper sessionsMapper;

    @Override
    public Sessions getSessionById(Long id) {
        return sessionsMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Sessions> listSessions() {
        return sessionsMapper.selectByExample(new SessionsExample());
    }
}
