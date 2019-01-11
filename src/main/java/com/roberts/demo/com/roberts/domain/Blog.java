package com.roberts.demo.com.roberts.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * This is an entity class like the ones we created last semester. It corresponds directly to the database which contains
 * a blog table. I had to write this by hand but I'm sure that there's a way to do it automatically. Nothing special about
 * this though.
 */
@Entity
public class Blog {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String title;
	private String content;

	public Blog() {  }

	public Blog(String title, String content) {
		this.setTitle(title);
		this.setContent(content);
	}

	public Blog(int id, String title, String content) {
		this.setId(id);
		this.setTitle(title);
		this.setContent(content);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Blog{" +
				"id=" + id +
				", title='" + title + '\'' +
				", content='" + content + '\'' +
				'}';
	}
}
