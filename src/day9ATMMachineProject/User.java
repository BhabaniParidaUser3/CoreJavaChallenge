package day9ATMMachineProject;


public class User {
	private int atmNumber;
	private int atmPin;
	
	//Parameterized Constructor
	public User(int atmNumber,int atmPin)
	{
		this.atmNumber=atmNumber;
		this.atmPin=atmPin;
	}
	
	
	//Getter Methods
	public int getatmNumber()
	{
		return atmNumber;
	}

	public int getatmPin()
	{
		return atmPin;
	}
	
	
}
