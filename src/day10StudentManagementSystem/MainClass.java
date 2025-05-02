package day10StudentManagementSystem;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		System.out.println("Welcome to Student management System\n");
		Scanner sc = new Scanner(System.in);

		StudentImplementationOperation SIO = new StudentImplementationOperation();
		boolean keepRunning = true;
		while (keepRunning) {
			System.out.println(
					"1.Add Stsudent\n2.Show All Students\n3.get Students based on RollNumber\n4.Delete Student\n5.Updtae Student\n6.Exit\nEnter Your Choice");

			int input = sc.nextInt();
			switch (input) {
			case 1:
				System.out.println("Enter Name:");
				String name = sc.next();
				System.out.println("Enter CollegeName:");
				String collegeName = sc.next();
				System.out.println("Enter City:");
				String city = sc.next();
				System.out.println("Enter Percentage");
				double percentage = sc.nextDouble();
				SIO.addStudent(name, collegeName, city, percentage);
				break;

			case 2:
				SIO.showAllStudents();
				break;
			case 3:
				System.out.println("Enter RollNumber:");
				int rollno=sc.nextInt();
				SIO.getStudentDetailsByRollNo(rollno);
				break;
			case 4:
				System.out.println("Enter RollNumber:");
				int rollnum=sc.nextInt();
				SIO.deleteStudent(rollnum);
				break;
			case 5:
				System.out.println("Enter RollNumber:");
				int rollnumb=sc.nextInt();
				SIO.updateStudent(rollnumb);
				break;
			case 6:
				keepRunning = false;
				System.out.println("Existing from Application");
				sc.close();
				break;
			default:
				System.out.println("Invalid choice. Please try again.");

			}
		}
	}

}
