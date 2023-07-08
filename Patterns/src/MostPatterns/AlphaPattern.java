
//rint the following pattern for the given N number of rows.
//Pattern for N = 3
// A
// BB
// CCC
//Input format :
//Integer N (Total no. of rows)
//Output format :
//Pattern in N lines
//Constraints
//0 <= N <= 26
//Sample Input 1:
//7
//Sample Output 1:
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF
//GGGGGGG
//-----------------------------------------------------------Java-------------------------------------------------------------
//--------------------------------------------------------By Rahul Rewar------------------------------------------|

package MostPatterns;

import java.util.Scanner;

public class AlphaPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner s =new Scanner(System.in);
	int n =s.nextInt();
	
	int i =1;
	  while(i<=n) {
		int j =1;
		while(j<=i) {
			char jthchar =(char)('A'+i-1);
	System.out.print(jthchar);
    	 
		j =j+1;
	  }
	    System.out.println();
      i =i+1;
	  }
      

		
	}

}
