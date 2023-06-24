package Assignments.assignmet1;

import java.util.Scanner;

public class SchoolGradeSystem {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        System.out.println("Please enter the overall score :"); 
	        double score = s.nextDouble();
	        
	        if ((score>=90.0)&&(score<=100))
	        System.out.println("Score:"+ score +" "+"Grade: AA" +" "+ "State: Passed");
	        else if ((score>=85.0) &&(score<90) )
	        System.out.println("Score:"+ score +" "+"Grade: AB" +" "+ "State: Passed");
	        else if ((score>=80.0)&&(score<85.0))
	        System.out.println("Score:"+ score +" "+"Grade: BA" +" "+ "State: Passed");
	        else if ((score>=75.0)&&(score<80.0))
	        System.out.println("Score:"+ score +" "+"Grade: BB" +" "+ "State: Passed");
	        else if ((score>=70.0)&&(score<75.0))
	        System.out.println("Score:"+ score +" "+"Grade: CB" +" "+ "State: Passed");
	        else if ((score>=65.0)&&(score<70.0))
	        System.out.println("Score:"+ score +" "+"Grade: CC" +" "+ "State: Passed");
	        else if ((score>=60.0)&&(score<65.0))
	        System.out.println("Score:"+ score +" "+"Grade: DC" +" "+ "State: Passed");
	        else if ((score>=50.0) && (score<60.0))
	        System.out.println("Score:"+ score +" "+"Grade: DD" +" "+ "State: Passed");
	        else if ((score>=0.0) && (score<50.0))
	        System.out.println("Score:"+ score +" "+"Grade: FF" +" "+ "State: Failed");
	        else 
	        System.out.println("Invalid score,program terminates");


	}

}
