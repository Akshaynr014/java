package com.dyashin.onetomanyAndmanytoone;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class PencilBox {
	@Id
	@Column
	 private int pid;
	@Column
	 private String name;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "pencilBox")
	private List<Pencil> pencil;
	 
	 
	public List<Pencil> getPencil() {
		return pencil;
	}
	public void setPencil(List<Pencil> pencil) {
		this.pencil = pencil;
	}
	public int getId() {
		return pid;
	}
	public void setId(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 

}
