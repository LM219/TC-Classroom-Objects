package io.zipcoder;

import org.junit.Test;
import org.junit.Assert;

public class ClassroomTest {

	
	@Test
	 public void addStudentTest(){
	        // :Given
		 	
		Student student1= new Student("Gillian", "Baird", 4);
	 	Student student2= new Student("Louise", "Milligan", 4);
	 	Student student3= new Student("Hugo", "Jeffreys", 4);
	 	Student student4= new Student("William", "Orange", 6);
	 	Student student5= new Student("John", "Watson", 5);
		 
	        Classroom classroomA = new Classroom(30);
	        
	        classroomA.addStudent(student1);
	        classroomA.addStudent(student2);
	        classroomA.addStudent(student3);
	        classroomA.addStudent(student4);

		
		 	
		 	
		 	boolean expected = true;
	        
		 	
	        //:when
		
	  
	        
	        Boolean actual = classroomA.addStudent(student5);

	        //:Then
	        Assert.assertEquals(expected, actual);
}
	
	@Test
	// students enrolled is more than maxstudents- should fail.
	 public void addStudentTes2t(){
	        // :Given
		 	
		Student student1= new Student("Gillian", "Baird", 4);
	 	Student student2= new Student("Louise", "Milligan", 4);
	 	Student student3= new Student("Hugo", "Jeffreys", 4);
	 	Student student4= new Student("William", "Orange", 6);
	 	Student student5= new Student("John", "Watson", 5);
		 
	        Classroom classroomA = new Classroom(4);
	        
	        classroomA.addStudent(student1);
	        classroomA.addStudent(student2);
	        classroomA.addStudent(student3);
	        classroomA.addStudent(student4);

		
		 	
		 	
		 	boolean expected = false;
	        
		 	
	        //:when
		
	  
	        
	        Boolean actual = classroomA.addStudent(student5);

	        //:Then
	        Assert.assertEquals(expected, actual);
}
	
	@Test
	 public void getStudentsEnrolledTest(){
	        // :Given
		 	
		Student student1= new Student("Gillian", "Baird", 4);
	 	Student student2= new Student("Louise", "Milligan", 4);
	 	Student student3= new Student("Hugo", "Jeffreys", 4);
	 	Student student4= new Student("William", "Orange", 6);
	 
		 
	        Classroom classroomA = new Classroom(30);
	        
	        classroomA.addStudent(student1);
	        classroomA.addStudent(student2);
	        classroomA.addStudent(student3);
	        classroomA.addStudent(student4);

		
		 	
		 	
		 	int expected = 4;
	        
		 	
	        //:when
		
	  
	        
	        int actual = classroomA.getStudentsEnrolled();

	        //:Then
	        Assert.assertEquals(expected, actual);
}
	@Test
	 public void removeStudentTest(){
	        // :Given
		 	
		Student student1= new Student("Gillian", "Baird", 4);
	 	Student student2= new Student("Louise", "Milligan", 4);
	 	Student student3= new Student("Hugo", "Jeffreys", 4);
	 	Student student4= new Student("William", "Orange", 6);
	 
		 	
		 
	        Classroom classroomA = new Classroom(4);
	        
	        classroomA.addStudent(student1);
	        classroomA.addStudent(student2);
	        classroomA.addStudent(student3);
	        classroomA.addStudent(student4);

		
		 	
		 	
		 	Student expected = student2;
	        
		 	
	        //:when
		
	  
	        
	        Student actual = classroomA.removeStudent("Louise", "Milligan");

	        //:Then
	        Assert.assertEquals(expected, actual);
}
	@Test
	// check that test outputs null when a student that does not exist is entered into the method.
	 public void removeStudentTest2(){
	        // :Given
		 	
		Student student1= new Student("Gillian", "Baird", 4);
	 	Student student2= new Student("Louise", "Milligan", 4);
	 	Student student3= new Student("Hugo", "Jeffreys", 4);
	 	Student student4= new Student("William", "Orange", 6);
	 	
		 	
		 
	        Classroom classroomA = new Classroom(4);
	        
	        classroomA.addStudent(student1);
	        classroomA.addStudent(student2);
	        classroomA.addStudent(student3);
	        classroomA.addStudent(student4);

		
		 	
		 	
		 	Student expected = null;
	        
		 	
	        //:when
		
	        
	        Student actual = classroomA.removeStudent("Simon", "Morrison");

	        //:Then
	        Assert.assertEquals(expected, actual);
}
	@Test
	// check that test outputs null when a student that does not exist is entered into the method.
	 public void getClassAverageTest(){
	        // :Given
		 	
		Student student1= new Student("Gillian", "Baird", 4);
	 	Student student2= new Student("Louise", "Milligan", 4);
	 	Student student3= new Student("Hugo", "Jeffreys", 4);
	 	Student student4= new Student("William", "Orange", 4);
	 	
		 	
		 	 student1.takeExam(75);
		 	 student1.takeExam(75);
		 	 student1.takeExam(75);
		 	student1.takeExam(75);
		 	 
		 	student2.takeExam(75);
		 	student2.takeExam(75);
		 	student2.takeExam(75);
		 	student2.takeExam(75);
		 	
		 	student3.takeExam(75);
		 	student3.takeExam(75);
		 	student3.takeExam(75);
		 	student3.takeExam(75);
		 	
		 	student4.takeExam(75);
		 	student4.takeExam(75);
		 	student4.takeExam(75);
		 	student4.takeExam(75);
		 	
		 	
	        Classroom classroomA = new Classroom(30);
	        
	        classroomA.addStudent(student1);
	        classroomA.addStudent(student2);
	        classroomA.addStudent(student3);
	        classroomA.addStudent(student4);

		
		 	
		 	
		 	Double expected = 75.00;
	        
		 	
	        //:when
		
	        
	        Double actual = classroomA.getClassAverage();

	        //:Then
	        Assert.assertEquals(expected, actual);
	}
	
	@Test
	// check that test outputs null when a student that does not exist is entered into the method.
	 public void getClassScoresTest(){
	        // :Given
		 	
		Student student1= new Student("Gillian", "Baird", 4);
	 	Student student2= new Student("Louise", "Milligan", 4);
	 	Student student3= new Student("Hugo", "Jeffreys", 4);
	 	Student student4= new Student("William", "Orange", 4);
	 	
		 	
		 	 student1.takeExam(75);
		 	 student1.takeExam(75);
		 	 student1.takeExam(75);
		 	student1.takeExam(75);
		 	 
		 	student2.takeExam(75);
		 	student2.takeExam(75);
		 	student2.takeExam(75);
		 	student2.takeExam(75);
		 	
		 	student3.takeExam(75);
		 	student3.takeExam(75);
		 	student3.takeExam(75);
		 	student3.takeExam(75);
		 	
		 	student4.takeExam(75);
		 	student4.takeExam(75);
		 	student4.takeExam(75);
		 	student4.takeExam(75);
		 	
		 	
	        Classroom classroomA = new Classroom(30);
	        
	        classroomA.addStudent(student1);
	        classroomA.addStudent(student2);
	        classroomA.addStudent(student3);
	        classroomA.addStudent(student4);

		
		 	
		 	
		 	String expected = "Gillian Baird-->75.0\nLouise Milligan-->75.0\nHugo Jeffreys-->75.0\nWilliam Orange-->75.0\n" ;
	        
		 	
	        //:when
		
	        
	        String actual = classroomA.getClassScores();

	        //:Then
	        Assert.assertEquals(expected, actual);
	}
}
