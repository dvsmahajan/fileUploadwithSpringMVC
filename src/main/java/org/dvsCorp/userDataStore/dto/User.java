package org.dvsCorp.userDataStore.dto;

import java.io.File;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="user_details")
public class User implements Serializable{
	
	@Id
	@GenericGenerator(name="primary",strategy="increment")
	@GeneratedValue(generator="primary")
	private int uId;
	private String username;
	private String password;
	private String email;
	private String photoPath;
	private String photoname;
	
	
	
	public User() {
		System.out.println(this.getClass().getSimpleName()+" is Created...............");
	}



	public int getuId() {
		return uId;
	}



	public String getUsername() {
		return username;
	}



	public String getPassword() {
		return password;
	}



	public String getEmail() {
		return email;
	}



	public String getPhotoPath() {
		return photoPath;
	}



	public String getPhotoname() {
		return photoname;
	}



	public void setuId(int uId) {
		this.uId = uId;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}



	public void setPhotoname(String photoname) {
		this.photoname = photoname;
	}



	@Override
	public String toString() {
		return "User [uId=" + uId + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", photoPath=" + photoPath + ", photoname=" + photoname + "]";
	}


	


}
