package com.dairy.service;

import java.util.List;

import com.dairy.domain.Story;

public interface StoryService {

	Story save(Story story);

	List<Story> findByUserId(String userId);

}
