package com.dairy.service;

import java.util.List;

import com.dairy.domain.Bookmark;

public interface BookmarkService {

	List<Bookmark> findByUserId(String userId);

	Bookmark save(Bookmark bookmark);

	void delete(String bookmarkId);

}
