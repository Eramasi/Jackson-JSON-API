package com.Jacksonapi;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(value=Include.NON_NULL)
public class Student {
	
	
	private Integer studeantId;
	
	private String studentName;
	
	private String studentSkill;
	
	public Integer getStudeantId() {
		return studeantId;
	}
	public void setStudeantId(Integer studeantId) {
		this.studeantId = studeantId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentSkill() {
		return studentSkill;
	}
	public void setStudentSkill(String studentSkill) {
		this.studentSkill = studentSkill;
	}
	@Override
	public String toString() {
		return "Student [studeantId=" + studeantId + ", studentName=" + studentName + ", studentSkill=" + studentSkill
				+ "]";
	}
	
	
	
	
	

}
