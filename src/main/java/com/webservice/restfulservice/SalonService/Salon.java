package com.webservice.restfulservice.SalonService;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Salon {
	@Id
	private String email;
	private String name;
	private String location;
	private int contact;
	private int rating;
	private String image;
	private String description;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Salon [email=" + email + ", name=" + name + ", location=" + location + ", contact=" + contact
				+ ", rating=" + rating + ", image=" + image + ", description=" + description + "]";
	}
	
}
