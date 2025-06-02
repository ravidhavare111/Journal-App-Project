package com.engineeringdigest.SB2_journalApp.service;

import com.engineeringdigest.SB2_journalApp.entity.UserObject;
import com.engineeringdigest.SB2_journalApp.repository.userEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class userEntryService {

    @Autowired
    userEntryRepository EntryUserRepository;


    public void addUserEntry(UserObject newUser) {

        EntryUserRepository.save(newUser);
    }

    public List<UserObject> getAllUserEntries() {
        return EntryUserRepository.findAll();
    }

    public UserObject getUserEntry(String UserName){

        return EntryUserRepository.findByUserName(UserName);
    }

    public void updateUserEntry(String userName, UserObject newUser) {
        UserObject oldUser = EntryUserRepository.findByUserName(userName);
        if(oldUser != null){
            oldUser.setUserName(newUser.getUserName());
            oldUser.setPassword(newUser.getPassword());
            EntryUserRepository.save(oldUser);
        }
    }
}
