package com.mory.repository;

import com.mory.model.Log;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends MongoRepository<Log, String> {
    Log findByUserId(String userId);
    Log findByUserIdAndDate(String userId,String date);
}
