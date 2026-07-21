//Dynamic Jagged Array 

//Jagged Array

import java.util.Scanner;

class Main
{
public static void main(String args[])
{

Scanner sc = new Scanner(System.in);

//Input of row size.....

System.out.print("Enter the number of rows: ");
int size1 = sc.nextInt();
int arr[][]=new int[size1][];


//input of col size for each row...

for(int i=0;i<arr.length;i++)
{
System.out.print("Enter the column size for "+(i+1)+" row : ");
int col=sc.nextInt();
arr[i]=new int[col];
}



//taking input of array elements..

System.out.print("\nEnter the array element:\n");
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr[i].length;j++)
{
System.out.print("Enter the element for row "+(i+1)+" and col "+(j+1)+" : ");
arr[i][j]=sc.nextInt();
}
}



//Printing the elements of jagged array...

System.out.print("\nArray element are:\n");
for(int row[]:arr)
{
for(int elem:row)
System.out.print(elem+" ");

System.out.println();
}

}
//End of class main
}