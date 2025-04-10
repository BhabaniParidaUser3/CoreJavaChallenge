package day7;

public class Student implements Person {

	private String name;
	private int Semester;
	private String branch;

	public Student(String name, int semester, String branch) {
		super();
		this.name = name;
		this.Semester = semester;
		this.branch = branch;
	}

	public String getName() {
		return name;
	}
	
	public int getSemester() {
		return Semester;
	}

	public String getBranch() {
		return branch;
	}


	@Override
	public String getType() {
		return "Student";
	}

	@Override
	public String getProfession() {
		return "Learning";
	}

}
