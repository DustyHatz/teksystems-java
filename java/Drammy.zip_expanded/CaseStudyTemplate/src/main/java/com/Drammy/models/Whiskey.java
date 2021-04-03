package com.Drammy.models;

import javax.persistence.*;

@Entity
@Table(name = "whiskey")
public class Whiskey {

	@Id
	@Column(name = "id", nullable = false)
	private int whiskeyId;
	
	@Column(name = "imageUrl", nullable = true)
	private String imageUrl;
	
	@Column(name = "distillery", nullable = true)
	private String distillery;
	
	@Column(name = "description", nullable = true)
	private String description;
	
	@Column(name = "name", nullable = true)
	private String name;
	
	@Column(name = "type", nullable = true)
	private String type;
	
	@Column(name = "url", nullable = true)
	private String url;
	
	
	
}

