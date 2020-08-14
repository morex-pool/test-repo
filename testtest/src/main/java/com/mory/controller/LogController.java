package com.mory.controller;

import com.mory.model.Log;
import com.mory.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test/v1/log")
public class LogController {

    @Autowired
    private LogService logService;

    @GetMapping(path = "/{userId}")
    public List<Log> getByUserId(@PathVariable("userId") String userId) {
        return logService.findByUserId(userId);
    }

    @GetMapping(path = "/")
    public List<Log> getAll() {
        return logService.getAll();
    }

    @PostMapping(path = "/")
    public void insert(@RequestBody Log logInformation) {
        logService.insert(logInformation);
    }

    @PutMapping(path = "/")
    public Log update(@RequestBody Log logInformation) {
        return logService.update(logInformation);
    }

    @DeleteMapping(path = "/{logId}")
    public void delete(@PathVariable("logId") String logId) {
        logService.delete(logId);
    }
}