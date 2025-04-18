package day8;

public class Admin implements Person{
	private String productName;
	private String brandName;
	private String itemDescription;
	private float price;
	private int quantity;
	
	public Admin(String productName,String brandName,String itemDescription,float price,int quantity)
	{
		super();
		this.productName=productName;
		this.brandName=brandName;
		this.itemDescription=itemDescription;
		this.price=price;
		this.quantity=quantity;
		
	}
	public String getProductName()
	{
		return productName ;
	}
	
	public String getBrandName()
	{
		return brandName;
	}
	
	public String getItemDescription()
	{
		return itemDescription;
	}
	
	public float getPrice()
	{
		return price;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	public String getType()
	{
		return "Admin";
	}



}
