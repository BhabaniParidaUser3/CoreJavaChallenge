package day8;

import java.util.Scanner;

public class ShoppingCart {

	public static void main(String[] args) {

		System.out.println("Welcome to Online Shopping Cart\n******************************* ");
		InventoryManagement im=new InventoryManagement();
		System.out.println("Press 1 Login as a User\nPress 2 Login as a Admin/Inventory Manager\nPress 3 for Exit");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		switch(input)
		{
			case 1:
				
			case 2:
				System.out.println("Enter Product Name");
				String pname=sc.next();
				System.out.println("Enter Brand Name");
				String bname=sc.next();
				System.out.println("Enter Item description");
				String itemdesc=sc.next();
				System.out.println("Enter Price");
				float prc=sc.nextFloat();
				System.out.println("Enter Quantity");
				int quan=sc.nextInt();
				im.entryToInventoryAsAdmin(pname, bname, itemdesc, prc, quan);
				System.out.println("Entry Successful !!!\nPress 1 to continue\nPress 0 to Main Menu");
			case 3:
				default:
					
		}
		
	}

}
