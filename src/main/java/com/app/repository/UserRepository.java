package com.app.repository;

import com.app.dao.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    public User findByName(String name);
    public User getUserByUpi(String upi);
}