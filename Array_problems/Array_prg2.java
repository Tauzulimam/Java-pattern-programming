//Input in an Array

import java.util.Scanner;

class Main
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
System.out.print("Enter the size of array: ");
int size=sc.nextInt();
int num[] = new int [size];		//declaration
for(int i=0;i<size;i++)
{
System.out.print("\nEnter the element for index "+i+" : ");
num[i]=sc.nextInt();
}
System.out.println("Array elements are:");
for(int i=0;i<size;i++)
System.out.print(num[i]+" ");


}		//End of main method
}		//End of main class