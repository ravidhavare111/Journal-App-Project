package com.engineeringdigest.SB2_journalApp.controller;

import com.engineeringdigest.SB2_journalApp.entity.UserObject;
import com.engineeringdigest.SB2_journalApp.service.userEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class userEntryController {

    @Autowired
    userEntryService userService;

    @PostMapping("/add")
    public void addUserEntry(@RequestBody UserObject newUser) {
        userService.addUserEntry(newUser);
    }

    @GetMapping("/all")
    public List<UserObject> getAllUserEntries() {
        return userService.getAllUserEntries();
    }

    @GetMapping("/one/{UserName}")
    public UserObject getuserEntry(@PathVariable String UserName) {
        return userService.getUserEntry(UserName);
    }

    @PutMapping("/update/{UserName}")
    public void updateUserEntry(@PathVariable String UserName, @RequestBody UserObject newUser) {
        userService.updateUserEntry(UserName, newUser);
    }


}
