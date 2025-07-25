package com.dyashin.onetomanyAndmanytoone;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity

public class Pencil {
     @Id
     @Column
	 private int id;
     @Column
     private String name;
     
     @ManyToOne(cascade =CascadeType.ALL)
     @JoinColumn(name="pid")
     private PencilBox pencilBox;

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

	public PencilBox getPencilBox() {
		return pencilBox;
	}

	public void setPencilBox(PencilBox pencilBox) {
		this.pencilBox = pencilBox;
	}
     
}
