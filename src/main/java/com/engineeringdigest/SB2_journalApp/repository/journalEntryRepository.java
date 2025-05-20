package com.engineeringdigest.SB2_journalApp.repository;

import com.engineeringdigest.SB2_journalApp.entity.JournalObject;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface journalEntryRepository extends MongoRepository<JournalObject, ObjectId> {

}
