package com.dyashin.onetoone;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Voterinfo")
public class VoterCard implements Serializable {
@Id
@Column
private int vid;
@Column
private String name;

@OneToOne(cascade = CascadeType.ALL,mappedBy = "vcard")
private User user;

public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public int getId() {
	return vid;
}
public void setId(int vid) {
	this.vid = vid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


}
