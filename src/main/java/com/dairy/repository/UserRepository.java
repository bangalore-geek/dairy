package com.dairy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dairy.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
