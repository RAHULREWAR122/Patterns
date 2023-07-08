
//Print the following pattern for the given N number of rows.
//Pattern for N = 4
//1
//21
//321
//4321
//Input format :
//Integer N (Total no. of rows)
//Output format :
//Pattern in N lines
//Constraints
//0 <= N <= 50
//Sample Input 1:
//5
//Sample Output 1:
//1
//21
//321
//4321
//54321
//------------------------------------------------------Java-----------------------------------------------------------------------------------------
//--------------------------------------------------By Rahul Rewar-----------------------------------------------------------------|
package MostPatterns;

import java.util.Scanner;

public class ReverseNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s =new Scanner(System.in);
		int n =s.nextInt();
	//	int p =1;
		  int i =1;
		  while(i<=n) {
			int j =1;
			while(j<=i) {
			//	p =i;
			System.out.print(i-j+1);
		
		
		   j=j+1;
	    	}
		     System.out.println();
		     i =i+1;
		    }
	
	}

}
