package chapter1;
import java.util.Arrays;
public class StringPermutation
{
	public static void main(String args[])
	{
		System.out.println("True : " + isPermutation("abcd", "abcd"));
		System.out.println("True : " + isPermutation("abcd", "dcba"));
		System.out.println("True : " + isPermutation("A FLS AASTLA", " ASSTF ALAAL"));
		System.out.println("False : " + isPermutation("A FLS AASLA", " ASSTF ALAAL"));
	}
	public static boolean isPermutation(String s1, String s2)
	{
		if(s1.length() != s2.length())
		{
			return false;
		}
		int[] ascii = new int[256];
		Arrays.fill(ascii, 0);
		for(int i = 0; i < s1.length(); i++)
		{
			ascii[(int)s1.charAt(i)]++;
		}
		for(int j = 0; j < s2.length(); j++)
		{
			ascii[(int)s2.charAt(j)]--;
		}
		
		for(int i = 0; i < ascii.length; i++)
		{
			if(ascii[i] != 0)
			{
				return false;
			}
		}
		return true;
	}
}
		