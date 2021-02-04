import java.util.Scanner;
import java.util.ArrayList;
import model.GradeBook;

public class GradeBookDriver {
	
		static Scanner in = null;
	
		public static void main(String[] args) {
	
			in = new Scanner (System.in); 
		    //(
			double score = 0;
			
			ArrayList<Double> grades = new ArrayList<Double> ();
			ArrayList<Character> letterGrades = new ArrayList<Character> ();
			
		    
			System.out.println("Enter Test Name:" );
		    String testName = in.nextLine();
		       
		    System.out.println("How many scores would you like to enter?:");
		    int numOfScores = in.nextInt();
		       
		    for(int i= 0; i < numOfScores; i++ ) {
		           
		        System.out.println("Enter each score");
		        score = in.nextInt();
		        grades.add(score);
		        	
		     }
		    
		    GradeBook newTest = new GradeBook(grades, "newTest", letterGrades);
		    newTest.setLetterGrades();
		    newTest.printLetterGrades();
		    
		    
		    
		    //setLetterGrades();
		 	//private char [ ] studentLetterGrades = { 'A', 'B', 'C', 'D', 'F'};
		 	//private double studentTestScores [ ][ ]; 

		 	//private String inputScores;
		 	//int option = 0;
		 	
		 		//GradeBook() {private String testName;

		    
		     
		   
		}
		
}
