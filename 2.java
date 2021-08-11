//Ascending and Descending order in Java

import java.util.*;
import java.util.Scanner;

public class Main

{
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		//Declare array size
		int n;
		System.out.println("Enter the size of array: ");
		
		n=sc.nextInt();  //Initialize
		
		System.out.println("Enter "+n+" numbers: ");
		
		List<Integer> mylist=new ArrayList<Integer>();
		
		for(int i=0;i<n;i++){
			mylist.add(sc.nextInt());
		}
		
		Collections.sort(mylist);
		System.out.println("Ascending order is: ");
		for(int j : mylist){
			System.out.print(j+" ");
		}
		
		Collections.sort(mylist,Collections.reverseOrder());
		System.out.println("\nDescending order is: ");
		for(int k:mylist){
			System.out.print(k+" ");
		}
	}
}