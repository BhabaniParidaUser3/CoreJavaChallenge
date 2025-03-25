package day6;

public class RemoveAllPunctuationFromAString {
	
	public static String RemoveAllPunctuation(String str)
	{
		String temp="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if ((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
			{
				temp=temp+ch;
			}
		}
		return temp;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(RemoveAllPunctuation("R{emoveAllPunctuation}"));

	}

}
