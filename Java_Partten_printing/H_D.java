//Hollow Daimond shape

import java.util.Scanner;

class H_D
{
public static void main(String args[])
{

Scanner sc = new Scanner(System.in);
System.out.print("Enter the num value: ");
int num=sc.nextInt();

	//Part A

for(int row=1;row<=num;row++)
{
	//Space

for(int col=1;col<=(num-row);col++)
System.out.print(" ");

	//Stars

if(row==1)
System.out.print("*");

else
{
System.out.print("*");

for(int col=1;col<=(2*row-3);col++)
System.out.print(" ");

System.out.print("*");
}
System.out.println();
}				//End of Part A.....

	//Part B

for(int row=1;row<num;row++)
{

	//Space
for(int col=1;col<=row;col++)
System.out.print(" ");

	//Stars
if(row==num-1)
System.out.print("*");

else
{

System.out.print("*");

for(int col=1;col<=(2*num-2*row-3);col++)
System.out.print(" ");

System.out.print("*");

}
System.out.println();
}				//End of Part B....



}	//End of main class
//End of H_D class
}