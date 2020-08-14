package com.mory.service.impl;

import com.mory.model.Log;
import com.mory.repository.LogRepository;
import com.mory.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogServiceImpl implements LogService {

	@Autowired
	private LogRepository logRepository;

	public Log findByUserId(String userId) {
		return logRepository.findByUserId(userId);
	}

	public List<Log> getAll() {
		return logRepository.findAll();
	}

	@Override
	public void insert(Log logInformation) {
		logRepository.save(logInformation);
	}

	@Override
	public Log update(Log logInformation) {
		logRepository.save(logInformation);
		return logRepository.findByUserIdAndDate(logInformation.getUserId(),logInformation.getDate());
	}

	@Override
	public void delete(String logId) {
		Log log = new Log();
		log.setId(logId);
		logRepository.delete(log);
	}
}