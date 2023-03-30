package factorial;

import java.util.Scanner;

class Factorial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no");
		   // n0 is 3
		 int no=s.nextInt();
		
		 int fact=1;
		   // fact=1
		   // fact=2
		   // fact=6
		 
		 for(int i=1;i<=no;i++)
		 {
			 // i = 1, 1<=3
			 // i = 2, 2<=3
			 // i = 3, 3<=3
			 fact=fact*i;
			 // 1=1*1
			 // 1=1*2
			 // 2=2*3
		 }
		 System.out.println("factorial of "+no+" is "+fact);
	}

}
