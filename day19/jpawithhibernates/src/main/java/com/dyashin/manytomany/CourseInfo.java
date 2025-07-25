package com.dyashin.manytomany;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "course_info")
public class CourseInfo {
	@Id
	private int cid;
	private String cname;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "course_student",
	joinColumns=@JoinColumn(name="cid"),
	inverseJoinColumns=@JoinColumn(name="sid"))
	private List<StudentInfo> studentInfo;
	
	public List<StudentInfo> getStudentInfo() {
		return studentInfo;
	}
	public void setStudentInfo(List<StudentInfo> studentInfo) {
		this.studentInfo = studentInfo;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}

}
