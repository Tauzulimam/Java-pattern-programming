import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class Sort
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);

System.out.print("Enter the size of array:");
int size = scan.nextInt();

Integer arr[] = new Integer[size];

System.out.print("Enter the array elements:");

for(int i=0;i<arr.length;i++)
{
arr[i]=scan.nextInt();
}

Arrays.sort(arr);
System.out.print("\nThe sorted array in accesnding order are:\n");
for(int num:arr)
System.out.print(num+" ");

Arrays.sort(arr, Collections.reverseOrder());

System.out.print("\nThe sorted array in deccesnding order are:\n");
for(int num:arr)
System.out.print(num+" ");

}//End of main method
}