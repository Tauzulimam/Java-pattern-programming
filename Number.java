import java.util.Scanner;

class Number
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number value: ");
int num=sc.nextInt();

for(int row=1;row<=num;row++)
{
for(int col=1;col<=row;col++)
System.out.print(col+" ");

System.out.println();
}		//End of row loop.....

}		//End of main class
}		//End of Number class