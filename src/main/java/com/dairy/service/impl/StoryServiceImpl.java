package com.dairy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dairy.domain.Story;
import com.dairy.repository.StoryRepository;
import com.dairy.service.StoryService;

@Service
public class StoryServiceImpl implements StoryService {

	@Autowired
	private StoryRepository storyRepository;

	@Override
	public Story save(Story story) {
		storyRepository.save(story);
		return story;
	}

	@Override
	public List<Story> findByUserId(String userId) {
		return storyRepository.findByUserId(userId);
	}

}
