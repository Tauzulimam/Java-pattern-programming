//Daimond Shape.....
import java.util.Scanner;
class Daimond
{
public static void main(String args[])
{
	Scanner scan = new Scanner(System.in);
	//Take dynamic input...	
int num=scan.nextInt();
int i=num;

	//part 1
for(int row=1;row<=num;row++)
{
	//Space
for(int col=1;col<=num-row;col++)
System.out.print(" ");

	//Stars
for(int col=1;col<=(2*row-1);col++)
System.out.print("*");

System.out.println();
}
// End of for part1...

	//Part2
for(int row=1;row<=num;row++)
{
if(row==1)
{
i--;
continue;
}
	//Space
for(int col=1;col<=(num-i);col++)
System.out.print(" ");

	//Star

for(int col=1;col<=(num+i-row);col++)
System.out.print("*");

i--;
System.out.println();
}

//End of part 2...
}

//end main
}