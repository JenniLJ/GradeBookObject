package model;
import java.util.ArrayList; 
//import java.util.Scanner;

public class GradeBook {
	private ArrayList <Double> grades = new ArrayList <Double> ();
	private String testName;
	private ArrayList <Character> letterGrades = new ArrayList <Character> ();
	
	public GradeBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public GradeBook(ArrayList<Double> grades, String testName, ArrayList<Character> letterGrades) {
		super();
		this.grades = grades;
		this.testName = testName;
		this.letterGrades = letterGrades;
	}
	
	public ArrayList<Double> getGrades() {
		return grades;
	}
	public void setGrades(ArrayList<Double> grades) {
		this.grades = grades;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public ArrayList<Character> getLetterGrades() {
		return letterGrades;
	}
	
	public void setLetterGrades() {

	    for (double score: grades) {
	    	if(score < 60) {
	   		 letterGrades.add('F');
	  		 }
   		 else if (score < 70) {
   			 letterGrades.add('D');
	    	 }
		 else if (score < 80) {
			 letterGrades.add('C');
	    	}
	    else if (score < 90) {
	    	letterGrades.add('B');
	    	}
	    else {
	    	letterGrades.add('A');
	    	}
	    }
	}
	
	public void printLetterGrades() {
		 System.out.println(testName);
        
	     System.out.print("  Score ----------- Grade \n");
	        
	     for (int n = 0; n < grades.size(); n++) {
	        System.out.print("  " + grades.get(n));
	        System.out.print("  ----------- ");
	        System.out.print(" " + letterGrades.get(n) + "\n");
	     }
	}
	
	/*public GradeBook(String testName, ArrayList<Double> grades, char letterGrades) {
		setGrades(grades);
		setTestName(testName);
		setLetterGrades(letterGrades);
	}
	//Scanner userIn = new Scanner(System.in); 
	
	//public static void main(String[] args) {

	
	
	//private char [ ] studentLetterGrades = { 'A', 'B', 'C', 'D', 'F'};
	//private double studentTestScores [ ][ ]; 

	//private String inputScores;
	//int option = 0;
	
		//GradeBook() {private String testName;

		
			//super();
			// Auto-generated constructor stub
	
		public char getLetterGrades() {
		return letterGrades;
		}

		public void setLetterGrades(char letterGrades) {
		
		this.letterGrades = letterGrades;
		}

		//getter
		public ArrayList<Double> getGrades() {
			return grades;
		}
	
		//setter
		public void setGrades(ArrayList<Double> grades) {
			this.grades = grades;
		}
	
		//getter
		public String getTestName() {
			return testName;
		}
		
		//setter
		public void setTestName(String newTestName) {
			this.testName = newTestName;
	
		
		/*public setLetterGrades(char newLetterGrades) {
			this.letterGrades = newLetterGrade;
		}*/
			
			
			
		}/*
	}

	
	/*public String getStudentName( int StudentIndex) {
		studentName = name;
		return studentNames.get( studentIndex );
	}
	*/

	//public double calculateAverageTestScore( double [ ] studentTestScores) {
		//for( int currentStudentTestScore = 0; currentStudentTestScore < studentTestScores.length; currentStudentTestScore++  ) {
			
		//}
	//}


