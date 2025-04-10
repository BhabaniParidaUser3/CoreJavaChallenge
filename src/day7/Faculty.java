package day7;

public class Faculty implements Person {

	private String name;
	private float experience;

	public Faculty(String name, float experience) {
		this.name = name;
		this.experience = experience;
	}

	public String getName() {
		return name;
	}

	public float getExperience() {
		return experience;
	}

	@Override
	public String getType() {
		return "faculty";
	}

	@Override
	public String getProfession() {
		return "teaching";
	}

}
