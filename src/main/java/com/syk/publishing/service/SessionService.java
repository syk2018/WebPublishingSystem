package com.syk.publishing.service;

import com.syk.publishing.mbg.model.Sessions;

import java.util.List;

public interface SessionService {

    Sessions getSessionById(Long id);

    List<Sessions> listSessions();
}
