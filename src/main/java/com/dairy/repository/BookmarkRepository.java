package com.dairy.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dairy.domain.Bookmark;

@Repository
public interface BookmarkRepository extends MongoRepository<Bookmark, String>{

	List<Bookmark> findByUserId(String userId);

}
