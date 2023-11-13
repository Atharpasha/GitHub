package Testscripts;

import java.util.ArrayList;
import java.util.HashSet;

import org.testng.annotations.Test;

public class JavaPr {

	
	@Test
	public void reverseArray()
	{
		
		int [][] a= {{1,2,3},{8,4,9},{31,11,21}};
		
		for(int i=a.length-1;i>=0;i--)
		{
			int[] b=a[i];
			for(int j=0;j<b.length;j++)
			{ 
				for(int k=j+1;k<b.length;k++)
				{
					if(b[j]<b[k])
					{
						int temp=b[j];
						b[j]=b[k];
						b[k]=temp;
					}
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
	}
	@Test
	public void countDupChar()
	{
		String s="automation";
		
		HashSet<Character> hs =new HashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			hs.add(s.charAt(i));
		}
		
		for(char h:hs)
		{
			int count=0;
			for(int i=0;i<hs.size();i++)
			{
				if(h==s.charAt(i))
				{
					count++;
				}	
			}
			if(count>1)
			{
				System.out.println("duplicate character is : "+h);
			}
		}
	}
	@Test
	public void productArray()
	{
		int[] a= {1,2,3,4};
		
		int frthmax=0;
		int secmax=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>frthmax)
			{
				secmax=frthmax;
				frthmax=a[i];
			}
			else if(a[i]>secmax)
			{
				secmax=a[i];
			}
		}
		
		System.out.println("product of two largest num  :"+ frthmax*secmax);
	}
	@Test
	public void list()
	{
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(2);
		ar1.add(4);
		ar1.add(6);
		ar1.add(8);
		ar1.add(4);
	
		HashSet<Integer> hs1=new HashSet<Integer>(ar1);
		
		//System.out.println(hs1);
		ArrayList<Integer> ar2=new ArrayList<Integer>();
		ar2.add(3);
		ar2.add(5);
		ar2.add(7);
		ar2.add(9);
		ar1.add(7);
		
		HashSet<Integer> hs2=new HashSet<Integer>(ar2);
		int sum1=0;
		int sum2=0;
		for(int hs:hs1)
		{
			sum1+=hs;
		}
		System.out.println(sum1);
		
		for(int hs:hs2)
		{
			sum2+=hs;
		}
		System.out.println(sum2);
		System.out.println("product of two list :"+sum1*sum2);
	}
}
