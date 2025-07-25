package com.dyashin.onetoone;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="userinfo")
public class User implements Serializable {
@Id	
@Column
private int id;
@Column
private String name;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="vid")
private VoterCard vcard;

public VoterCard getVcard() {
	return vcard;
}

public void setVcard(VoterCard vcard) {
	this.vcard = vcard;
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


}
