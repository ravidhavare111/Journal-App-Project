package com.engineeringdigest.SB2_journalApp.repository;

import com.engineeringdigest.SB2_journalApp.entity.UserObject;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface userEntryRepository extends MongoRepository<UserObject, ObjectId> {
    UserObject findByUserName(String userName);
}
