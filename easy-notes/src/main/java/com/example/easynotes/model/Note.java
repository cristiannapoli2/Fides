package com.example.easynotes.model;

import java.io.Serializable;
import java.util.Date;


import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "notes")
public class Note implements Serializable{

	//ATTRIBUTI
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ManyToOne
	@JoinColumn(name="author_id", referencedColumnName="id")
	private Long id;
	
	@Column(nullable = false, updatable = false)
	 private String title;
	
	@Column(nullable = false, updatable = false)
	 private String content;
	 
	 @Column(nullable = false, updatable = false)
	 @Temporal(TemporalType.TIMESTAMP)
	 @CreatedDate
	 private Date createdAt;
	 
	 @Column(nullable = false)
	 @Temporal(TemporalType.TIMESTAMP)
	 @LastModifiedDate
	 private Date updatedAt;
	
	 //METODI SETTERS & GETTERS
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	//COSTRUTTORE BASE
	public Note() {
		super();
	}
	
	//COSTRUTTORE PARAMETRIZZATO
	public Note(Long id, String title, String content, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	
	//COSTRUTTORE PARAMETRIZZATO SENZA ID
	public Note(String title, String content, Date createdAt, Date updatedAt) {
		super();
		this.title = title;
		this.content = content;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	
	
	
}
