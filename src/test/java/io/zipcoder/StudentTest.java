package io.zipcoder;

import org.junit.Test;


import org.junit.Assert;

public class StudentTest {

	
	@Test
	 public void getNameTest(){
	        // :Given
		 	
		 	Student student1= new Student("Gillian", "Baird", 4);
		 	Student student2= new Student("Louise", "Milligan", 4);
		 	Student student3= new Student("Hugo", "Jeffreys", 4);
		 	Student student4= new Student("William", "Orange", 6);
		 	Student student5= new Student("John", "Watson", 5);
		
		 	
		 	
		 	String expected = "Gillian";
	        
		 	
	        //:when
	        student1.getFirstName();
	  
	        
	        String actual = student1.getFirstName();

	        //:Then
	        Assert.assertEquals(expected, actual);
	}
	
	@Test
	 public void getExamsTaken(){
	        // :Given
		 	
		Student student1= new Student("Gillian", "Baird", 4);
	 	Student student2= new Student("Louise", "Milligan", 4);
	 	Student student3= new Student("Hugo", "Jeffreys", 4);
	 	Student student4= new Student("William", "Orange", 6);
	 	Student student5= new Student("John", "Watson", 5);
		
		 	
		 	
		 	int expected = 0;
	        
		 	
	        //:when
	        student1.getExamsTaken();
	  
	        
	        int actual = student1.getExamsTaken();

	        //:Then
	        Assert.assertEquals(expected, actual);

}

	@Test
	 public void takeExamTest(){
	        // :Given
		 	
		Student student1= new Student("Gillian", "Baird", 4);
	 	Student student2= new Student("Louise", "Milligan", 4);
	 	Student student3= new Student("Hugo", "Jeffreys", 4);
	 	Student student4= new Student("William", "Orange", 6);
	 	Student student5= new Student("John", "Watson", 5);
		 	
	        student1.takeExam(95);

		
		 	
		 	
		 	Boolean expected = true;
	        
		 	
	        //:when
		
	  
	        
	        Boolean actual = student1.takeExam(95);

	        //:Then
	        Assert.assertEquals(expected, actual);
	}
	
	@Test
	 public void printExam(){
	        // :Given
		 	
		Student student1= new Student("Gillian", "Baird", 4);
	 	Student student2= new Student("Louise", "Milligan", 4);
	 	Student student3= new Student("Hugo", "Jeffreys", 4);
	 	Student student4= new Student("William", "Orange", 6);
	 	Student student5= new Student("John", "Watson", 5);
		 	
	        student1.takeExam(95);

		
		 	
		 	
		 	String expected = "[95, 0, 0, 0]";
	        
		 	
	        //:when
		
	  
	        
	        String actual = student1.printExamScores();

	        //:Then
	        Assert.assertEquals(expected, actual);
}
	
	
	@Test
	 public void printExam2(){
	     // Test to check that it will print no exams have been taken when exam taken==0.
		// :Given
		 	
		Student student1= new Student("Gillian", "Baird", 4);
	 	Student student2= new Student("Louise", "Milligan", 4);
	 	Student student3= new Student("Hugo", "Jeffreys", 4);
	 	Student student4= new Student("William", "Orange", 6);
	 	Student student5= new Student("John", "Watson", 5);
		 	

		
		 	
		 	
		 	String expected = "No exams taken";
	        
		 	
	        //:when
		
	  
	        
	        String actual = student1.printExamScores();

	        //:Then
	        Assert.assertEquals(expected, actual);
	}
	@Test
	 public void getAverage(){
	        // :Given
		 	
		Student student1= new Student("Gillian", "Baird", 4);
	 	Student student2= new Student("Louise", "Milligan", 4);
	 	Student student3= new Student("Hugo", "Jeffreys", 4);
	 	Student student4= new Student("William", "Orange", 6);
	 	Student student5= new Student("John", "Watson", 5);
		 	
	        student1.takeExam(50);
	        student1.takeExam(50);
	        student1.takeExam(50);
	        student1.takeExam(50);

		
		 	
		 	
		 	Double expected = 50.00;
	        
		 	
	        //:when
		
	  
	        
	        Double actual = student1.getAverage();

	        //:Then
	        Assert.assertEquals(expected, actual);
}
	
	@Test
	 public void changeExamScoreForExam(){
	        // :Given
		 	
		Student student1= new Student("Gillian", "Baird", 4);
	 	Student student2= new Student("Louise", "Milligan", 4);
	 	Student student3= new Student("Hugo", "Jeffreys", 4);
	 	Student student4= new Student("William", "Orange", 6);
	 	Student student5= new Student("John", "Watson", 5);
		 	
	        student1.takeExam(50);
	        student1.takeExam(50);
	        student1.takeExam(50);
	        student1.takeExam(50);
	        
	       student1.changeScoreForExam(2, 75);

		
		 	
		 	
		 	Double expected = 56.25;
	        
		 	
	        //:when
		
	  
	        
	        Double actual = student1.getAverage();

	        //:Then
	        Assert.assertEquals(expected, actual);
}
}
