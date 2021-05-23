package com.Jacksonapi.pojo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.Jacksonapi.Student;
import com.Jacksonapi.Students;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJSONConverter {
	
	public static void convertToJson() throws JsonProcessingException
	{
		Student s1=new Student();
		s1.setStudeantId(102);
		s1.setStudentName("Teju");
		s1.setStudentSkill("Java Developer");
		
		Student s2=new Student();
		s2.setStudeantId(103);
		s2.setStudentName("Tejuvenkat");
		s2.setStudentSkill("Java REST API Developer");
		
		
		List<Student> ls1=new ArrayList<Student>();
		ls1.add(s1);
		ls1.add(s2);
		ObjectMapper mapper=new ObjectMapper();
		String jsonString1=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(ls1);
		
		System.out.println(jsonString1);
	}

	public static void convertsToJson1() throws JsonProcessingException {
		Student s=new Student();
		s.setStudeantId(101);
		s.setStudentName("Chakravarthy Chowdary");
		s.setStudentSkill("Java with Rest API");
		
		
		// To convert Object to JSON format using below methods
		
		ObjectMapper mapper=new ObjectMapper();
		// Formating purpose we need to use writerWithDefaultPrettyPrinter()
		
		String jsonString=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(s);
		
		//String jsonString=mapper.writeValueAsString(s);
		System.out.println(jsonString);
	}
	
	public static void ConvertToJsonObjs() throws JsonParseException, JsonMappingException, IOException
	{
		File f=new File("Students.json");
		ObjectMapper mapper=new ObjectMapper();
		Student[] student=mapper.readValue(f, Student[].class);
		for(Student s:student)
		{
			System.out.println(s);
		}
		
	}
	
	public static void ConvertToJsonObj() throws JsonParseException, JsonMappingException, IOException
	{
		File f=new File("Student.json");
		ObjectMapper mapper=new ObjectMapper();
		Student student=mapper.readValue(f, Student.class);
		System.out.println(student);
	}
	
	public static Students getStudentsDetails()
	{
		List<Student> slist=new ArrayList<Student>();
		Student s1=new Student();
		s1.setStudeantId(100);
		s1.setStudentName("RamPrakash");
		s1.setStudentSkill("Azure Data Engineer");
		
		Student s2=new Student();
		s2.setStudeantId(109);
		s2.setStudentName("RamPrakash Naidu");
		s2.setStudentSkill("Azure Certified Professionla");
		slist.add(s1);
		slist.add(s2);
		
		Students students=new Students();
		students.setStudents(slist);
		
		return students;
		
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		System.out.println("Convert Objects into JSON Format using JACKSON API");
//		convertToJson();
//		System.out.println("Convert Object into JSON Format Using JACKSON API");
//		convertsToJson1();
//		
//		System.out.println("Convert JSON format into Objects using JACKSON API");
//		ConvertToJsonObjs();
//		
//		System.out.println("Convert JSON format into Object using JACKSON API");
//		ConvertToJsonObj();
//		
		
		getStudentsDetails();
		
	}

}
