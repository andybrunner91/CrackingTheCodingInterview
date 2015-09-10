package chapter1;
import java.util.Arrays;
public class UniqueChars
{
	public static void main(String args[])
	{
		String[] stringArray = {"", "s", "abcdefg", "Abca", "aabc", "deffghi", "lmnoppp"};
		System.out.println("With data structures: ");
		for(String s : stringArray)
		{
			System.out.println(s + " : " + allUnique(s));
		}
		
		System.out.println("Without data structures: ");
		for(String s : stringArray)
		{
			System.out.println(s + " : " + noDataStruct(s));
		}
		
			
	}
	
	public static boolean allUnique(String s)
	{
		int[] ascii = new int[256];
		for(int i = 0; i < ascii.length; i++)
		{
			ascii[i] = 0;
		}
		
		for(int i = 0; i < s.length(); i++)
		{
			ascii[s.charAt(i)]++;
			if(ascii[s.charAt(i)] == 2)
			{
				return false;
			}
		}
		
		return true;
		
	}
	
	public static boolean noDataStruct(String s)
	{
		if(s.length() < 2)
		{
			return true;
		}
		char[] charArray = s.toCharArray();
		Arrays.sort(charArray);
		for(int i = 1; i < charArray.length; i++)
		{
			if(charArray[i] == charArray[i-1])
			{
				return false;
			}
		}
		return true;
	}
}