package day1;

public class ReverseAStringWithoutusingBuiltInFunctions {

	public static void main(String[] args) {

		String name = "Bhabani sankar";
		String name1 = "";
		String name2 = "";
		String name3 = "";
		

		//Print raknas inabahB using charAt & print inside of for loop
		for (int i = name.length() - 1; i >= 0; i--) {
			//System.out.print(name.charAt(i));

		}
		System.out.println();

		//Print knas inabahB using charAt & print inside of for loop
		for (int i = name.length() - 3; i >= 0; i--) {
			//System.out.print(name.charAt(i));

		}
		System.out.println();
		
		//Print raknas inabahB using toCharArray & print inside of for loop
		char[] namearray = name.toCharArray();
		for (int i = namearray.length - 1; i >= 0; i--) {
			//System.out.print(namearray[i]);
		}
		System.out.println();

		// print knas inabahB using charAt & print outside of for loop
		for (int i = name.length() - 3; i >= 0; i--) {
			name1 = name1.concat(String.valueOf(name.charAt(i)));
//name1 = name1 + name.charAt(i);
//name1 += name.charAt(i);
		}
		//System.out.println(name1);
		
		// print knas inabahB using charAt & print inside of for loop
		//Reverse string using one loop, start from 0 index to length index.
		for(int i=0;i<=name.length()-3;i++)
		{
			name2=name2+name.charAt(name.length()-(3+i));
		}
		System.out.println(name2);
		
		
		/*
		 * i=0,14-3=11,k i=1,14-4=10,n i=2,14-5=9,a i=3,14-6=8,s i=4,14-7=7,
		 * i=5,14-8=6,i i=6,14-9=5,n i=7,14-10=4,a i=8,14-11=3,b i=9,14-12=2,a
		 * i=10,14-13=1,h i=11,14-14=0,B
		 */
		 System.out.println();
		
		//Reverse a sentence word by word. Example: Input: "I am Bhabani." Output: "Bhabani am I"
		String sentence="I am Bhabani";
		String[] sentence1=sentence.split(" ");
		for(int i=sentence1.length-1;i>=0 ;i--)
		{
			System.out.print(sentence1[i]+" ");
		}
		

	}
	

}
