package array_Programs;

import java.util.Scanner;

public class Array_vowels 
{
	void vowels(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
            count++;
		}
		System.out.println("No of vowels: "+count);
	}
	public static void main(String[] args) 
	{
		Array_vowels a=new Array_vowels();
		Scanner sc=new Scanner(System.in);
		System.out.println("Input: ");
		String str=sc.next();
		a.vowels(str);

	}

}
