package com.dairy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dairy.domain.Bookmark;
import com.dairy.repository.BookmarkRepository;
import com.dairy.service.BookmarkService;

@Service
public class BookmarkServiceImpl implements BookmarkService {

	@Autowired
	private BookmarkRepository bookmarkRepository;

	@Override
	public List<Bookmark> findByUserId(String userId) {
		return bookmarkRepository.findByUserId(userId);
	}

	@Override
	public Bookmark save(Bookmark bookmark) {
		return bookmarkRepository.save(bookmark);
	}

	@Override
	public void delete(String bookmarkId) {
		bookmarkRepository.delete(bookmarkId);
	}

}
