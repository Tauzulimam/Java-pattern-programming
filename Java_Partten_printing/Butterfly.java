//ButterFly shape

import java.util.Scanner;

class Butterfly
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
System.out.print("Enter the num value: ");
int num=sc.nextInt();

for(int row=1;row<=num;row++)
{
		//Stars
for(int col=1;col<=row;col++)
System.out.print("*");

		//Space
for(int col=1;col<=(2*num-2*row);col++)
System.out.print(" ");

		//Stars
for(int col=1;col<=row;col++)
System.out.print("*");

System.out.println();   //New line...

}			//End of Part 1

for(int row=1;row<=num;row++)
{

		//Stars
for(int col=1;col<=(num+1-row);col++)
System.out.print("*");

		//Space
for(int col=1;col<=(2*row-2);col++)
System.out.print(" ");

		//Stars
for(int col=1;col<=(num+1-row);col++)
System.out.print("*");


System.out.println();
}			//End of PART2


}			//End of main class
}			//End of class