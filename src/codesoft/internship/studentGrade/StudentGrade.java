package codesoft.internship.studentGrade;

import java.util.Scanner;

public class StudentGrade {
	double marks=0;
	int count=0;
	public void studentGrade() {
		
		
		int noOfSubjects=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number of subjects");
		int num =sc.nextInt();
		System.out.println("enter marks");
		while(noOfSubjects<num) {
			double enteredMarks=sc.nextInt();
			if( enteredMarks<=100 ) {
				marks=marks + enteredMarks;
				count++;
				noOfSubjects++;
			}
			
			
		}
//		System.out.println(count);
		
	}
	
	public double averageMarks() {
		return marks/count;
	}
	
	public void gradingSystem(double average) {
		
		if(average>90){
			
			System.out.println("Average:" +average+ " Congratulations Grade: A");
			
		}
		else if(average>81 && average<=90){
			
			System.out.println("Average:" +average+ " Congratulations Grade: B");
			
		}
		else if(average>71 && average<=80){
			
			System.out.println("Average:" +average+ " Congratulations Grade: C");
			
		}
		else if(average>61 && average<=70) {
			
			System.out.println("Average:" +average+ " Congratulations Grade: D");
		}
		else if(average>51 && average<=60) {
			
			System.out.println("Average:" +average+ " Congratulations Grade: E");			
		}
		else {
			System.out.println("Average:" +average+ " Try Hard Next Time!");
			
		}
		
	}

	public static void main(String[] args) {
		
		StudentGrade object = new StudentGrade();
		object.studentGrade();
		double average=object.averageMarks();
		object.gradingSystem(average);

	}

}
