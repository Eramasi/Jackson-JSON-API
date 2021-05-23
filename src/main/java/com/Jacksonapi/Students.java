package com.Jacksonapi;

import java.util.List;

public class Students {
	
	private List<Student> students;

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Students [students=" + students + "]";
	}
	
	
	

}
