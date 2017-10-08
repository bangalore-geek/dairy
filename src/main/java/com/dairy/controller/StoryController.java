package com.dairy.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dairy.domain.Story;
import com.dairy.service.StoryService;

@RestController
@RequestMapping("/api")
public class StoryController {

	@Autowired
	private StoryService storyService;

	@GetMapping("/story")
	public Object getStories() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("stories", storyService.findByUserId("59d79ece061cefae93003145"));
		return model;
	}

	@PostMapping("/story")
	public Object saveStory(@RequestBody Story story) {
		Map<String, Object> model = new HashMap<String, Object>();
		story.setCreatedDate(new Date());
		story.setUserId("59d79ece061cefae93003145");
		model.put("story", storyService.save(story));
		return model;
	}

}
