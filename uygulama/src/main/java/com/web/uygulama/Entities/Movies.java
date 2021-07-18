package com.web.uygulama.Entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //It defines that a class can be mapped to a table.
@Table(name="movies") //It allows you to specify the details of the table that will be used to persist the entity in the database
public class Movies {
	@Id//indicating the member field below is the primary key of current entity.
	@Column(name="ID")//It is used to specify the mapped column for a persistent property or field.
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="year")
	private int year;
	
	@Column(name="type")
	private String type;
	
	@Column(name="media")
	private String media;
	
	@Column(name="language")
	private String language;
	
	@Column(name="player")
	private String player;
	
	@Column(name="player2")
	private String player2;
	
	@Column(name="player3")
	private String player3;

	public Movies(int id, String name, int year, String type, String media, String language, String player,
			String player2, String player3) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
		this.type = type;
		this.media = media;
		this.language = language;
		this.player = player;
		this.player2 = player2;
		this.player3 = player3;
	}
	public Movies() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMedia() {
		return media;
	}
	public void setMedia(String media) {
		this.media = media;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getPlayer() {
		return player;
	}
	public void setPlayer(String player) {
		this.player = player;
	}
	public String getPlayer2() {
		return player2;
	}
	public void setPlayer2(String player2) {
		this.player2 = player2;
	}
	public String getPlayer3() {
		return player3;
	}
	public void setPlayer3(String player3) {
		this.player3 = player3;
	}
	
}
