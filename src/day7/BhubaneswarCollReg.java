package day7;

import java.util.Scanner;

public class BhubaneswarCollReg {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean keeprunning = true;

		SiliconCollege siliconCollege = new SiliconCollege();
		System.out.println("Welcome to Silicon college.\n-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
		while (keeprunning) {
			System.out.println(
					"Press 1 to register as a student.  \nPress 2 to register as a faculty.  \nPress 00 to show all available students.  \nPress 11 to show all available faculties.  \nPress 5 to exit. ");
			int input = sc.nextInt();

			switch (input) {
			case 1:
				System.out.println("Enter Your Name:");
				String name = sc.next();
				System.out.println("Enter Your Semester:");
				int semester = sc.nextInt();
				System.out.println("Enter Your Branch:");
				String branch = sc.next();
				siliconCollege.registerAsStudent(name, semester, branch);
				System.out.println("Congratulations! you have been successfully registered in silicon college.\n");
				break;

			case 2:
				System.out.println("Enter Your Name:");
				String name1 = sc.next();
				System.out.println("Enter Your experience:");
				float experience = sc.nextFloat();
				siliconCollege.registerAsFaculty(name1, experience);
				System.out.println("Congratulations! you have been successfully registered in silicon college.\n");
				break;
			case 00:
				if(siliconCollege.personList.isEmpty())
				{
					System.out.println("Sorry No Student registerd yet\n");
				}
				for (int index = 0; index < siliconCollege.personList.size(); index++) {
					Person person = siliconCollege.personList.get(index);
					// System.out.println(person.getType());
					if (person.getType() == "Student") {
						Student st = (Student) person;
						System.out.println("Name: " + st.getName() + " " + "Semester: " + st.getSemester() + " "
								+ "Branch :" + st.getBranch()+"\n");
					}
				}
				break;

			case 11:
				if(siliconCollege.personList.isEmpty())
				{
					System.out.println("Sorry No Faculty registerd yet\n");
				}
				for (int index = 0; index < siliconCollege.personList.size(); index++) {
					Person person = siliconCollege.personList.get(index);
					// System.out.println(person.getType());
					if (person.getType() == "faculty") {
						Faculty ft = (Faculty) person;
						System.out
								.println("Name: " + ft.getName() + " " + "Experience: " + ft.getExperience() + "Years\n");
					}
				}
				break;
			case 5:
				System.out.println("Exit From program & Execution stopped,Thank You!!!");
				keeprunning = false;
				break;
			default:
				System.out.println("Invalid choice. Please try again.\n");

			}
		}
		sc.close();

	}
}
