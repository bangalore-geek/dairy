package com.dairy.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "story")
public class Story {

	@Id
	private String id;
	private String title;
	private String tag;
	private String desc;
	private String content;
	private String userId;
	private Date createdDate;

	public Story() {
		super();
	}

	public Story(String id, String title, String tag, String desc, String content, String userId, Date createdDate) {
		super();
		this.id = id;
		this.title = title;
		this.tag = tag;
		this.desc = desc;
		this.content = content;
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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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
		return "Story [id=" + id + ", title=" + title + ", tag=" + tag + ", desc=" + desc + ", content=" + content
				+ ", userId=" + userId + ", createdDate=" + createdDate + "]";
	}

}
