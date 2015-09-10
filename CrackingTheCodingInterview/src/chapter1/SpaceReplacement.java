package chapter1;
public class SpaceReplacement
{
	public static void main(String[] args)
	{
		char[] a = "Mr John Smith    ".toCharArray();
		betterReplace(a, 13);
		System.out.println(new String(a) + ".");
	}
	public static char[] replace(char[] theArray, int trueSize)
	{
		String s = new String(theArray);
		int padding = 0;
		for(int i = 0; i < trueSize; i++)
		{
			if(s.charAt(i+padding) == ' ')
			{
				s = s.substring(0,i+padding) + "%20" + s.substring(i+1+padding,s.length());
				padding += 2;
			}
			
		}
		
		return s.substring(0,trueSize + padding).toCharArray();
	}
	
	public static void betterReplace(char[] a, int trueSize)
	{
		int j = a.length-1;
		for(int i = trueSize-1;i>-1;i--)
		{
			if(a[i] != ' ')
			{
					a[j] = a[i];
			}
			else
			{
				a[j] = '0';
				a[j-1] = '2';
				a[j-2] = '%';
				j-=2;
			}
			j--;
		}
	}
}
			