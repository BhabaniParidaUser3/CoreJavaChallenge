package day10StudentManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentImplementationOperation implements StudentInterfaceOperation {

	List<Student> students = new ArrayList<>();
	int rollnumber = 1;

	@Override
	public void addStudent(String studentName, String collegeName, String city, double percentage) {
		Student s = new Student();
		s.setRollno(rollnumber++);
		s.setStudentName(studentName);
		s.setCollegeName(collegeName);
		s.setCity(city);
		s.setPercentage(percentage);
		students.add(s);
		System.out.println("Record Inserted Successfully\n");

	}

	public void showAllStudents() {
		if (students.isEmpty()) {
			System.out.println("No student records found.\n");

		} else {
			for (int i = 0; i < students.size(); i++) {
				Student s = students.get(i);
				System.out.println("Name: " + s.getStudentName() + "\n" + "CollegeName:" + s.getCollegeName() + "\n"
						+ "CityName:" + s.getCity() + "\n" + "Percentage:" + s.getPercentage() + "\n" + "RollNo:"
						+ s.getRollno() + "\n" + "--------------");

			}

		}
	}

	public void getStudentDetailsByRollNo(int rollno) {
		boolean found = false;
		for (Student s : students) {
			if (s.getRollno() == rollno) {
				System.out.println("Name: " + s.getStudentName() + "\n" + "CollegeName:" + s.getCollegeName() + "\n"
						+ "CityName:" + s.getCity() + "\n" + "Percentage:" + s.getPercentage() + "\n" + "RollNo:"
						+ s.getRollno() + "\n");
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("No student found with Roll No: " + rollno);
		}
	}

	public void deleteStudent(int rollnum) {
		boolean removed = false;

		for (int i = 0; i < students.size(); i++) {
			
			if(students.get(i).getRollno()==rollnum)
			{
				students.remove(i);
				removed=true;
				System.out.println("Student with roll Number:"+rollnum+" deleted successfully");
				break;
			}
		}
		
		if(!removed)
		{
			System.out.println("No Student found with this roll number"+ rollnum);
		}

	}
	
	public void updateStudent(int rollnumb)
	{
		 Scanner sc = new Scanner(System.in);
		    boolean found = false;

		    for (Student s : students) {
		        if (s.getRollno() == rollnumb) {
		            found = true;

		            System.out.println("Student Found. What do you want to update?");
		            System.out.println("1. Name\n2. College Name\n3. City\nEnter choice:");
		            int choice = sc.nextInt();

		            switch (choice) {
		                case 1:
		                    System.out.println("Enter new name:");
		                    String newName = sc.next();
		                    s.setStudentName(newName);
		                    System.out.println("Name updated successfully.");
		                    break;

		                case 2:
		                    System.out.println("Enter new college name:");
		                    String newCollege = sc.next();
		                    s.setCollegeName(newCollege);
		                    System.out.println("College name updated successfully.");
		                    break;

		                case 3:
		                    System.out.println("Enter new city:");
		                    String newCity = sc.next();
		                    s.setCity(newCity);
		                    System.out.println("City updated successfully.");
		                    break;

		                default:
		                    System.out.println("Invalid choice.");
		            }
		            break;
		        }
		    }

		    if (!found) {
		        System.out.println("No student found with Roll No: " + rollnumb);
		    }
		
	}

}
