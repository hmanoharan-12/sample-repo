package com.webservice.restfulservice.UserService;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class User {
	@Id
	private String email;
	private String fname;
	private String lname;
	private String image;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", fname=" + fname + ", lname=" + lname + ", image=" + image + "]";
	}
}
