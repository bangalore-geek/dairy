package com.dairy.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dairy.service.BookmarkService;
import com.dairy.service.StoryService;

@RestController
@RequestMapping("/api")
public class DashboardController {

	@Autowired
	private BookmarkService bookmarkService;

	@Autowired
	private StoryService storyService;

	@GetMapping("/dashboard")
	public Object getDashboardData() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("storyCount", storyService.findByUserId("59d79ece061cefae93003145").size());
		model.put("bookmarkCount", bookmarkService.findByUserId("59d79ece061cefae93003145").size());
		return model;
	}

}
