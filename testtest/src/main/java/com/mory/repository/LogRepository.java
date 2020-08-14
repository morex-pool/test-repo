package com.mory.repository;

import com.mory.model.Log;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogRepository extends MongoRepository<Log, String> {
    List<Log> findByUserId(String userId);
    Log findByUserIdAndDate(String userId,String date);
}
