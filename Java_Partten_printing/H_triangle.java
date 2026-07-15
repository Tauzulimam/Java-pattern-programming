//Hollow triangle java code

import java.util.Scanner;
class H_triangle
{
public static void main(String args[])
{
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the n value");
	int n=scan.nextInt();
	
	for(int row=1;row<=n;row++)
{
	
	if(row==1 || row==2 || row==n)
{
	for(int col=1;col<=row;col++)
{
	System.out.print("*");
}

}
else
{
	System.out.print("*");
//Space
	for(int col=1;col<=row-2;col++)
{
			System.out.print(" ");
		
}	
		System.out.print("*");

}
	System.out.println();
//end of main for
}

//end of main method	
}
}