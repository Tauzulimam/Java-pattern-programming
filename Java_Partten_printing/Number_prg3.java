/* Printing
  
      1
    2 2 2
  3 3 3 3 3
4 4 4 4 4 4 4

*/
import java.util.Scanner;

class Number_prg3
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.print("Enter the row value:");
int num=sc.nextInt(); 
for(int row=1;row<=num;row++)
{
for(int col=1;col<=num-row;col++)
System.out.print("  ");

for(int col=1;col<=(2*row-1);col++)
System.out.print(row+" ");

System.out.println();
}			//End of row....
}
}		//End of main class