package com.dairy.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dairy.domain.Bookmark;
import com.dairy.service.BookmarkService;

@RestController
@RequestMapping("/api")
public class BookmarkController {

	@Autowired
	private BookmarkService bookmarkService;

	@GetMapping("/bookmark")
	public Object getBookmarks() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("bookmark", bookmarkService.findByUserId("59d79ece061cefae93003145"));
		return model;
	}

	@PostMapping("/bookmark")
	public Object saveBookmark(@RequestBody Bookmark bookmark) {
		Map<String, Object> model = new HashMap<String, Object>();
		bookmark.setCreatedDate(new Date());
		bookmark.setUserId("59d79ece061cefae93003145");
		model.put("story", bookmarkService.save(bookmark));
		return model;
	}

	@DeleteMapping("/bookmark/{id}")
	public Object deleteBookamrk(@PathVariable("id") String id) {
		Map<String, Object> model = new HashMap<String, Object>();
		bookmarkService.delete(id);
		return model;
	}

}
