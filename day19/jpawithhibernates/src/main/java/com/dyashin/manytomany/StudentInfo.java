package com.dyashin.manytomany;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_info")
public class StudentInfo {
	@Id
	private int sid;
	private String sname;
	
@ManyToMany(cascade = CascadeType.ALL,mappedBy = "studentInfo")
	private List<CourseInfo> courseInfo;
	public int getSid() {
		return sid;
	}

	public List<CourseInfo> getCourseInfo() {
		return courseInfo;
	}

	public void setCourseInfo(List<CourseInfo> courseInfo) {
		this.courseInfo = courseInfo;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

}
