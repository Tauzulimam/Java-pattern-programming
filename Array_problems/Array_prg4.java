//Finding max element in an array

import java.util.Scanner;

class Main
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter Array Size: ");
int size = sc.nextInt();
int num[]=new int[size];
int min;

System.out.print("Enter array elements: ");
for(int i=0;i<size;i++)
{
num[i]=sc.nextInt();
}
min=num[0];
for(int i=0;i<size;i++)
{
if(min<num[i])
min=num[i];
}

System.out.println("Smallest element in a given array is: "+min);

}		//End of main method
}	//End of main class