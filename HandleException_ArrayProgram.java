package array_Programs;

public class HandleException_ArrayProgram 
{

	public static void main(String[] args) 
	{
		int[] a1=new int[3];
		try {
			a1[0]=1;
			a1[1]=2;
			a1[2]=3;
			a1[3]=4;
			a1[4]=5;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("An ArrayIndexOutOfBoundsException Occurred!");
			System.out.println(e.getMessage());
		}
		for(int i=0;i<a1.length;i++)
		{
			System.out.println(a1[i]);
		}
	

	}

}
