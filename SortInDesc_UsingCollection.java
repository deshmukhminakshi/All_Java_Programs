package array_Programs;

import java.util.Arrays;
import java.util.Collections;

public class SortInDesc_UsingCollection 
{

	public static void main(String[] args) 
	{
		Integer a1[] = { 1, 2, 3, 4, 5 };
		 
        // Sorting the array in descending order
        Arrays.sort(a1, Collections.reverseOrder());
 
        // Printing the elements
        System.out.println(Arrays.toString(a1));
	}

}
