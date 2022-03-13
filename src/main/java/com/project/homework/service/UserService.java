package com.project.homework.service;

import com.project.homework.exception.UserNotFoundException;
import com.project.homework.model.User;
import com.project.homework.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {
    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
    public User addUser(User user) {

        return userRepo.save(user);
    }

    public List<User> findAllUsers() {
        return userRepo.findAll();
    }

    public User updateUser(User user) {
        return userRepo.save(user);
    }

    public void deleteUser(Long id){
        userRepo.deleteUserById(id);
    }

    public User findUserByEmail(String email) {
        return userRepo.findUserByEmail(email)
                .orElseThrow(() -> new UserNotFoundException("User by email " + email+ " was not found"));
    }


}
