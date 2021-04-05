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

	public Whiskey() {
		super();
	}

	public Whiskey(String name) {
		super();
		this.name = name;
	}

	public Whiskey(int whiskeyId, String imageUrl, String distillery, String description, String name, String type,
			String url) {
		super();
		this.whiskeyId = whiskeyId;
		this.imageUrl = imageUrl;
		this.distillery = distillery;
		this.description = description;
		this.name = name;
		this.type = type;
		this.url = url;
	}

	public int getWhiskeyId() {
		return whiskeyId;
	}

	public void setWhiskeyId(int whiskeyId) {
		this.whiskeyId = whiskeyId;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getDistillery() {
		return distillery;
	}

	public void setDistillery(String distillery) {
		this.distillery = distillery;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Whiskey [whiskeyId=" + whiskeyId + ", imageUrl=" + imageUrl + ", distillery=" + distillery
				+ ", description=" + description + ", name=" + name + ", type=" + type + ", url=" + url + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((distillery == null) ? 0 : distillery.hashCode());
		result = prime * result + ((imageUrl == null) ? 0 : imageUrl.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		result = prime * result + whiskeyId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Whiskey other = (Whiskey) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (distillery == null) {
			if (other.distillery != null)
				return false;
		} else if (!distillery.equals(other.distillery))
			return false;
		if (imageUrl == null) {
			if (other.imageUrl != null)
				return false;
		} else if (!imageUrl.equals(other.imageUrl))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		if (whiskeyId != other.whiskeyId)
			return false;
		return true;
	}
	
	
}

