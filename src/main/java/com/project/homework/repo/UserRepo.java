package com.project.homework.repo;

import com.project.homework.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
    void deleteUserById(Long id);


    Optional<User> findUserByEmail(String email);


}
