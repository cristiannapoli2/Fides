package com.example.easynotes.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "authors")
public class Author {
	
	//ATTRIBUTI
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@OneToMany(mappedBy="")
	private long id;
	
	@Column(nullable = false)
	private String name;
	
	@Column
	private int age;
	
	
	// METODI SETTERS & GETTERS
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//COSTRUTTORE PARAMETRIZZATO
	public Author(long id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	// COSTRUTTORE PARAMETRIZZATO
	public Author(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// COSTRUTTORE BASE 
	public Author() {
		super();
	}
	
	
	
	
	
}
