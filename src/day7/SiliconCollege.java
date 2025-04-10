package day7;

import java.util.ArrayList;
import java.util.List;

public class SiliconCollege {
	List<Person> personList = new ArrayList<>();

	public void registerAsStudent(String name, int semester, String branch) {
		Student st = new Student(name, semester, branch);
		personList.add(st);
	}

	// register as faculty.

	public void registerAsFaculty(String name, float experience) {
		Faculty ft = new Faculty(name, experience);
		personList.add(ft);
	}
}
