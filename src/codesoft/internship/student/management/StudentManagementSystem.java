package codesoft.internship.student.management;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
	
	ArrayList <Student> studentList = new ArrayList<Student>();
	public void appInterface() {
		while(true) {
			
			System.out.println("press 1 to add student");
			
			System.out.println("press 2 to delete student");
			
			System.out.println("press 3 to display student");
			
			System.out.println("press 4 to search student");
			
			System.out.println("press 5 to Exit App");
			
			Scanner sc =new Scanner(System.in);
			int choice= sc.nextInt();
			
			
			if(choice!=5) {
				switch(choice) {
				
				case 1:
					Scanner addObject = new Scanner(System.in);
					System.out.println("Enter Student Name");
					String studentName = addObject.nextLine();
					System.out.println("Enter Student Roll number");
					int rollNo = addObject.nextInt();
//					System.out.println("Enter Student Grade");
//					String grade = addObject.nextLine();
					
					addStudent(studentName,rollNo);
					writeFile(studentList);
					displayStudent();
					break;
				case 2: 
					Scanner deleteObject = new Scanner(System.in);
					System.out.println("Enter roll no of a student to be deleted");
					int rollNo1= deleteObject.nextInt();
					deleteStudent(rollNo1);
					displayStudent();
					break;
				
				case 3 :			
					displayStudent();
					
					break;
				
				case 4 :
					Scanner searchObject=new Scanner  (System.in);
					System.out.println("Enter roll no of a student to be searched");
					int rollNo3 = searchObject.nextInt();
					searchStudent(rollNo3);
					break;
					
				}
				
			}
			else
			break;
			
			
		}
		
		
		
	}
	
	
	private void searchStudent(int rollNo3) {
		   studentList=readFile();
		for(int i=0;i<studentList.size();i++) {
			Student currentStudent= studentList.get(i);
			if(currentStudent.getRollNo()==rollNo3) {
				System.out.println(currentStudent);
			}
		}
		
	}


	private void addStudent(String studentName, int rollNo) {
		
		Student object = new Student(studentName,rollNo);
		studentList=readFile();
		
		studentList.add(object);
		
	}


	private void displayStudent() {
		System.out.println(readFile());
		
	}


	private void deleteStudent(int rollNo) {
		
		Student studentToRemove = null; 
		studentList = readFile();
		for(Student element :studentList) {
			if(element.getRollNo()==rollNo) {
//				studentList.remove(element);
				studentToRemove=element;
				break;
			}
			
		}
		if(studentToRemove!=null) {
			
			studentList.remove(studentToRemove);
			
		}
		
		writeFile(studentList);
		
		
		
	}
	
	public void writeFile( ArrayList<Student> studentListtobewritten) {
		
		File file =new File("StdentArrayList.txt");
		try {
			ObjectOutputStream write= new ObjectOutputStream(new FileOutputStream(file));
			write.writeObject(studentListtobewritten);
			write.close();
			
		}catch( IOException ioe) {
			
			System.out.println("IOEXCEPTION");
			ioe.printStackTrace();
			
		}
		
		
	}
	
	
	public ArrayList<Student> readFile() {
		
		ArrayList<Student> studentfileList=null;
		
		File file =new File("StdentArrayList.txt");
		try {
			ObjectInputStream read= new ObjectInputStream(new FileInputStream(file));
			 studentfileList = (ArrayList<Student>)read.readObject();
		
			read.close();
			
			
			
		}catch( IOException ioe) {
			
			System.out.println("IOEXCEPTION");
			ioe.printStackTrace();
			
		}
		catch( ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		return studentfileList;
		
	}
	public static void main(String[] args) {
		StudentManagementSystem interfaceObject = new StudentManagementSystem();
		interfaceObject.appInterface();
		
	}


}
