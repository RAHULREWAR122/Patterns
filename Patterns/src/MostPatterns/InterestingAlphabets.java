
//Print the following pattern for the given number of rows.
//Pattern for N = 5
//E
//DE
//CDE
//BCDE
//ABCDE
//Input format :
//N (Total no. of rows)
//Output format :
//Pattern in N lines
//Constraints
//0 <= N <= 26
//Sample Input 1:
//8
//Sample Output 1:
//H
//GH
//FGH
//EFGH
//DEFGH
//CDEFGH
//BCDEFGH
//ABCDEFGH
//------------------------------------------------------------Java----------------------------------------------------------------------
//-----------------------------------------------------By Rahul Rewar------------------------------------------|


package MostPatterns;

import java.util.Scanner;

public class InterestingAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int n =s.nextInt();
		  int i =1;
		  while(i<=n) {
		
			  char p =(char)(n-i+65);
				int j =1;
				while(j<=i) {
	        
				
		     	System.out.print(p);
		     p =(char)(p+1);
		
			 j=j+1;
	    	}
		      System.out.println();
		       i =i+1;
	      
		   }

	}

}
