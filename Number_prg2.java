/* Printing

   1
  121
 12321
1234321

*/
import java.util.Scanner;

class Number_prg2
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the value of row:");
int num=sc.nextInt();
for(int row=1;row<=num;row++)
{
int count=1;
for(int col=1;col<=(num-row);col++)
System.out.print(" ");

for(int col=1;col<=row;col++)
{
System.out.print(col);
}

for(int col=(row-1);col>0;col--)
System.out.print(col);

System.out.println();

}				//End of row loop........


}
}		//End of class Main