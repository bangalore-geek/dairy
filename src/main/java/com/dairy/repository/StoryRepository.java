package com.dairy.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dairy.domain.Story;

@Repository
public interface StoryRepository extends MongoRepository<Story, String> {

	List<Story> findByUserId(String userId);

}
