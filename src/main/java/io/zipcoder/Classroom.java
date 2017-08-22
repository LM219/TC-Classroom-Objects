package io.zipcoder;

//import static org.hamcrest.CoreMatchers.instanceOf;

public class Classroom {
	private Student[] students;
	// Helper fields
	private int studentsEnrolled;
	private int maxStudents;

	/**
	 * Empty constructor. You get to decide what max students should default to.
	 */
	public Classroom() {
		this.maxStudents = 30;
		students = new Student[maxStudents];

	}

	/**
	 * Constructor where the caller defines what maxStudents is.
	 * 
	 * @param maxStudents
	 */
	public Classroom(int maxStudents) {
		this.maxStudents = maxStudents;
		students = new Student[maxStudents];
		// Students enrolled defaults to zero as it's an int.
	}

	/**
	 * Constructor that builds a class from an existing Student array.
	 * 
	 * @param students
	 */
	public Classroom(Student[] students) {
		this.students = students;
		maxStudents = students.length;
		studentsEnrolled = students.length;

	}

	/**
	 * Adds a student to the class, and returns true. If you cannot add any more
	 * students, then return false and print an error statement.
	 * 
	 * @param student
	 * @return
	 */

	public int getStudentsEnrolled() {
		return studentsEnrolled;
	}

	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}

	public int getMaxStudents() {
		return maxStudents;
	}

	public boolean addStudent(Student student) {

		if (studentsEnrolled < maxStudents) {
			students[studentsEnrolled] = student;
			studentsEnrolled++;
			return true;
		} else {
			System.out.println("Sorry our class is FULL!");
			return false;
		}

	}

	/**
	 * Returns the student with the firstName and lastName, and removes them
	 * from the array. If there is no student, return null. NOTE: You're going
	 * to want to move some students around in the array so that there are no
	 * empty spaces in the middle.
	 * 
	 * @param firstName
	 * @param lastName
	 * @return
	 */
	public Student removeStudent(String firstName, String lastName) {
		Student output = null;
		
		for (int x = 0; x < students.length-1; x++)
		{
			if (students[x].getFirstName().equals(firstName) && students[x].getLastName().equals(lastName)) {
				output = students[x];
				students[x] = null;
				for (int y = x; y < students.length - 1; y++) {
					students[y] = students[y+1];
				}
				students[students.length-1] = null;
				studentsEnrolled--;
			}
		}
		return output;
	}


	/**
	 * Return the average score of all of the student's average scores.
	 */
	public double getClassAverage() {
		Double[] averageTestScores = new Double[studentsEnrolled];
		for (int x = 0; x < studentsEnrolled; x++) {
			averageTestScores[x] = students[x].getAverage();
		}
		double sum = 0;
		for (double d : averageTestScores) {
			sum += d;
		}
		double average = sum / (averageTestScores.length);
		return average;
	}

	/**
	 * Return a string of student names and their averages, like.
	 *
	 * Students: Bart Simpson -> 72.4 Homer Simpson -> 0.1 Lisa Simpson -> 100.0
	 * Milhouse Van Houten -> 87.6
	 *
	 * If there are no students in the array, return No Students.
	 *
	 * @return
	 */
	public String getClassScores() {
		String studentScores = "";
		Double[] averageTestScores = new Double[studentsEnrolled];
		for (int x = 0; x < studentsEnrolled; x++) {
			averageTestScores[x] = students[x].getAverage();
		}
		for (int x = 0; x < studentsEnrolled; x++) {
			studentScores += students[x].getFirstName() + " " + students[x].getLastName() + "-->"
					+ students[x].getAverage() + "\n";

		}
		return studentScores;
	}

	
	
}
