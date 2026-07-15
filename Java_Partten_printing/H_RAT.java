//Hollow Right angle triangle
import java.util.Scanner;

class H_RAT
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
System.out.print("Enter n value");
int num=scan.nextInt();
for(int row=1;row<=num;row++)
{
//space
for(int col=1;col<=num-row;col++)
System.out.print(" ");

//1st and nth row
if(row==1 ||row==num)

for(int col=1;col<=2*row-1;col++)
System.out.print("*");


//1*_______space 1*
else
{
System.out.print("*");
for(int col=1;col<=2*row-3;col++)
System.out.print(" ");
System.out.print("*");
}

System.out.println();
}

}
//end of main
}