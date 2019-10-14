package com.backend.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;

@Entity(name = "Event")
public class Event {

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private int id;
	
	@Column
	private String titre;
	
	@Column(length = 100000)
	@Lob
	private String description;
	
	@Column
	private String flyer;
	
	@Column
	private Date dateDebut;
	
	@Column
	private Date dateFin;
	
	@Column
	private Date dateModification;
	
	@Column 
	private Boolean etat;
	
	@Column
	private String address;
	
	@ManyToMany
	@JoinTable( name = "event_image", joinColumns = @JoinColumn(name = "event_id"), inverseJoinColumns = @JoinColumn(name = "image_id"))
	List<Gallery> images;
	
	@ManyToMany
	@JoinTable( name = "event_tag", joinColumns = @JoinColumn(name = "event_id"), inverseJoinColumns = @JoinColumn(name = "tag_id"))
	List<Tag> tags;

	@ManyToMany
	@JoinTable( name = "event_participant", joinColumns = @JoinColumn(name = "event_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
	List<User> participants;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}


	public Date getDateModification() {
		return dateModification;
	}

	public void setDateModification(Date dateModification) {
		this.dateModification = dateModification;
	}

	public Boolean getEtat() {
		return etat;
	}

	public void setEtat(Boolean etat) {
		this.etat = etat;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public List<User> getParticipants() {
		return participants;
	}

	public void setParticipants(List<User> participants) {
		this.participants = participants;
	}

	public String getFlyer() {
		return flyer;
	}

	public void setFlyer(String flyer) {
		this.flyer = flyer;
	}

	public List<Gallery> getImages() {
		return images;
	}

	public void setImages(List<Gallery> images) {
		this.images = images;
	}

}
