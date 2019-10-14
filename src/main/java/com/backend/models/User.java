package com.backend.models;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name = "User")
public class User {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private int id;
	
	@Column
	private String nom;
	
	@Column
	private String prenom;
	
	@Column
	private String pass;
	
	@Column
	private String email;
	
	@Column
	private Date dateNaissance;
	
	@Column
	private String photo;
	
	@Column
	private boolean etat;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    private Role role;
	
	@JsonManagedReference
	@OneToMany(mappedBy="author")
	private List<Blog> blogs;
	
	@Column
	private String resetToken;
	
	@ManyToMany(mappedBy = "participants")
	List<Event> events;
	
	public User() {

	}

	public User(int id, String nom, String pass, String email, Date dateNaissance, String cv, 
			Role role, String photo, boolean etat) {
		super();
		this.id = id;
		this.nom = nom;
		this.pass = pass;
		this.email = email;
		this.dateNaissance = dateNaissance;
		this.role = role;
		this.photo = photo;
		this.etat = etat;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public boolean isEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	public String getResetToken() {
		return resetToken;
	}

	public void setResetToken(String resetToken) {
		this.resetToken = resetToken;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public List<Blog> getBlogs() {
		return blogs;
	}

	public void setBlogs(List<Blog> blogs) {
		this.blogs = blogs;
	}	
	
	
}
