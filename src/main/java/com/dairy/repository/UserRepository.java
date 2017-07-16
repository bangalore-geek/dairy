package com.dairy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dairy.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

}
