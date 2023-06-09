package com.project.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Actors")
public class ActorsTable {
	@Id
	@Column(name="sno")
	private int id;
	private String firstname;
	private String lastname;
	private int age;
	private String gender;
	private int movies;
	public int getId()
	{
		return id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getMovies() {
		return movies;
	}
	public void setMovies(int movies) {
		this.movies = movies;
	}
	public void setId(int id) {
		this.id = id;
	}

}
