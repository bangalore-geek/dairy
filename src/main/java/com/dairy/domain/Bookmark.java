package com.dairy.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bookmark")
public class Bookmark {

	@Id
	private String id;
	private String title;
	private String tag;
	private String url;
	private String userId;
	private Date createdDate;

	public Bookmark() {
		super();

	}

	public Bookmark(String id, String title, String tag, String url, String userId, Date createdDate) {
		super();
		this.id = id;
		this.title = title;
		this.tag = tag;
		this.url = url;
		this.userId = userId;
		this.createdDate = createdDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "Bookmark [id=" + id + ", title=" + title + ", tag=" + tag + ", url=" + url + ", userId=" + userId
				+ ", createdDate=" + createdDate + "]";
	}

}
