package day8;

public class User implements Person{
	
	private String productname;
	private String brandname;
	private int quantity;
	
	public User(String productname,String brandname,int quantity)
	{
		super();
		this.productname=productname;
		this.brandname=brandname;
		this.quantity=quantity;
		
	}
	
	public String getproductName()
	{
		return productname;
	}
	
	public String getBrandName()
	{
		return brandname;
	}
	
	public int getQuantity()
	{
		return quantity;
	}

	@Override
	public String getType() {
		return "User";
	}

}
