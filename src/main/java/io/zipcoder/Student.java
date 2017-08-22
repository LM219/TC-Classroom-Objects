package io.zipcoder;

import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private int[] testScores;
    // These are helper methods to assist us with array operations.
    private int totalExams;
    private int examsTaken;

    /**
     * Constructor for a student with just their first and last name.
     * You must make a default amount of tests here.
     * @param firstName
     * @param lastName
     */
    public Student(String firstName, String lastName) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    }

    /**
     * How we're going to construct our students when we know how many tests they're going to take
     * @param firstName
     * @param lastName
     * @param totalExams
     */
    public Student(String firstName, String lastName, int totalExams) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.totalExams = totalExams;
    	this.testScores = new int [totalExams];
    	

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
    	this.firstName = firstName;
    	
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
    	this.lastName = lastName;

    }

    public int getTotalExams() {
        return totalExams;
    }

    public void setTotalExams(int totalExams) {
    	this.totalExams = totalExams;

    }

    public int getExamsTaken() {;
        return examsTaken;
    }


    /**
     * What we want here is a string that, if a student hasn't taken any tests, returns a `no tests taken` string.
     * Otherwise, we want to return something kind of like:
     * Test Scores:
     * Test 1 -> 100
     * Test 2 -> 89
     * Test 3 -> 54
     * @return The test scores in a nice string representation.
     */
    public String printExamScores() {
    	String output= "";
    	if (examsTaken==0)
    	{
    		output= "No exams taken"; 
    	}
    	else 
    	{
    		output= Arrays.toString(testScores);
    	}
        return output;
    }

    /**
     * This function should add the grade in the correct position in the testScores array.
     * Make sure the score is between 0 and 100, and that the student isn't taking more tests than they're supposed to.
     * If there is a problem, print an error message and return false.
     * Otherwise, return true and put the score in the right spot.
     * @param score
     * @return A boolean based on if the operation worked or not.
     */
    public boolean takeExam(int score) {
    	String arrayBefore= Arrays.toString(testScores);
    	String arrayAfter= "";
    	
    	if(examsTaken< totalExams)
    	{
        		if  (score<100 && score>0)
        		{
        			testScores[examsTaken]= score;
        			arrayAfter= Arrays.toString(testScores);
        			examsTaken++;
        			return true;
        		}
        		else 
        		{
        			return false;
        		}
    	}
   
    	else
    	{
    		System.out.println("You have already sat all your exams");
    		return false;
    	}
    	
 
    
    }
   

    /**
     * Change the score for one of the students tests.
     * Be aware that the new score must be between 0 and 100, and that they have already taken that test
     * since it doesn't make sense to change the grade on an exam that they haven't taken it.
     * @param examNum Which test the we want to change.
     * @param newScore What we want to change it to.
     * @return A boolean based on if the operation worked or not.
     */
    public boolean changeScoreForExam(int examNum, int newScore){
    String arrayBefore= Arrays.toString(testScores);
    testScores[examNum-1]= newScore;
    String arrayAfter= Arrays.toString(testScores);
    
    if (arrayBefore.equals(arrayAfter))
	{
		return false;
	}
	else {
		return true;
	}
    }

    /**
     * Return the average for all of the exams that the student has taken.
     * If they haven't taken any, be nice and give them 100.0.
     * @return The average for all the exams a student has taken.
     */
    public double getAverage() {
    	
    if (examsTaken==0)
    {
    	 return 100.0;
    }
    else {
    	int sum = 0;
    	for (int d : testScores) 
    	{
    		sum += d;
    	}
    	double average = (1.0d * sum) / (examsTaken);
    	return average;
    }
 
    }
}
    
    
