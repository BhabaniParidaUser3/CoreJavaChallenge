package day3;

public class CountTheNumberOfVowelsAndConsonantsInAString {
	
	
	public void countVowelConsonant(String name)
	{
		
		int vowelcount=0;
		int consonantcount=0;
		for(int i=0;i<name.length();i++)
		{
			char result=name.charAt(i);
			if(result == 'a' || result == 'e' || result== 'i' || result=='o' || result=='u')
			{
				vowelcount++;
			}
			else
			{
				consonantcount++;
			}
		}
		System.out.println("vowelcount "+vowelcount);
		System.out.println("consonantcount "+consonantcount);
	}
	
	


	public void countVowelConsonant1(String name)
	{
		String vowelString = "aeiou";
		int vowelcount=0;
		int consonantcount=0;
		for(int i=0;i<name.length();i++)
		{
			if(vowelString.contains(name.charAt(i)+""))
			{
				vowelcount++;
			}
			else
			{
				consonantcount++;
			}
		}
		System.out.println("vowelcount "+vowelcount);
		System.out.println("consonantcount "+consonantcount);
	}
	
	
	public void countVowelConsonant2(String name)
	{
		
		int vowelcount=0;
		int consonantcount=0;
		for(int i=0;i<name.length();i++)
		{
			int result=name.charAt(i);
			
			if(result >= 65 && result <= 90 || result >= 97 && result<= 122)
			{
				if(result == 'a' || result == 'e' || result== 'i' || result=='o' || result=='u' ||result == 'A' || result == 'E' || result== 'I' || result=='O' || result=='U')
				{
					vowelcount++;
				}
				else
				{
					consonantcount++;
				}
				
			}
			
			else
			{
				
			}
			
		}
		System.out.println("vowelcount "+vowelcount);
		System.out.println("consonantcount "+consonantcount);
		}
		
	
	
	public static void main(String[] args) {
		CountTheNumberOfVowelsAndConsonantsInAString a =new CountTheNumberOfVowelsAndConsonantsInAString();
		a.countVowelConsonant2("BhAbani");
		
	}

}
