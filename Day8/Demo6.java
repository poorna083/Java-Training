/*Write a program to find the number of distinct elements in an unsorted array. [Do it without sorting the array]


Input Input:

Input consists of n+1 integers. 

The first integer corresponds to n, the number of elements in the array. 

The next n integers correspond to the elements in the array. 

Assume that the maximum value of n is 15.

 

Output Format:

Output consists of a single integer which corresponds to the number of distinct elements in the array.*/

 
//with using Booleannn

import java.util.*;
public class Demo6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[]array = new int[size];
        for(int i=0;i<size;i++)
		{    
		    array[i]=sc.nextInt();
		}
		
		int count=0;
		
		for(int i=0;i<size;i++)
		{
		    boolean isDuplicate=false;
		    for(int j=0;j<i;j++)
		    {
		        if(array[i]==array[j])
		        {
		            isDuplicate=true;
		            break;
		        }
	    	}
	    	
	    	if(!isDuplicate)
	    	{
	    	    count++;
	    	}   
	    }
    }
}

