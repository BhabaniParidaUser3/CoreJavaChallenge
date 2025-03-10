package day1;

public class ReverseAStringWithoutusingBuiltInFunctions {

	public static void main(String[] args) {

		String name = "Bhabani sankar";
		String name1 = "";

		//Print raknas inabahB using charAt & print inside of for loop
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));

		}
		System.out.println();

		//Print knas inabahB using charAt & print inside of for loop
		for (int i = name.length() - 3; i >= 0; i--) {
			System.out.print(name.charAt(i));

		}
		System.out.println();
		
		//Print raknas inabahB using toCharArray & print inside of for loop
		char[] namearray = name.toCharArray();
		for (int i = namearray.length - 1; i >= 0; i--) {
			System.out.print(namearray[i]);
		}
		System.out.println();

		// print knas inabahB using charAt & print outside of for loop
		for (int i = name.length() - 3; i >= 0; i--) {
			name1 = name1.concat(String.valueOf(name.charAt(i)));
//name1 = name1 + name.charAt(i);
//name1 += name.charAt(i);
		}
		System.out.println(name1);
		
		// print Bhabani sank using charAt & print inside of for loop
		for(int i=0;i<=name.length()-3;i++)
		{
			System.out.print(name.charAt(i));
		}


	}

}
