package com.mory.service;

import com.mory.model.Log;

import java.util.List;

public interface LogService {
    Log findByUserId(String userId);
    List<Log> getAll();
    void insert(Log logInformation);
    Log update(Log logInformation);
    void delete(String logId);
}
