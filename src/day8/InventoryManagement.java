package day8;

import java.util.ArrayList;
import java.util.List;

public class InventoryManagement {
	List<Person> personList=new ArrayList<>();
	
	//make entry to inventory as a Admin
	public void entryToInventoryAsAdmin(String productName,String brandName,String itemDescription,float price,int quantity)
	{
		Admin ad=new Admin(productName,brandName,itemDescription,price,quantity);
		personList.add(ad);
		
	}
	

}
