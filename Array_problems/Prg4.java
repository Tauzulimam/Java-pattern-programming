//Jagged Array


class Main
{
public static void main(String args[])
{


//Input of row size.....
int arr[][]=new int[3][];


//input of col size for each row...
arr[0] = new int []{1,2,3};
arr[1] = new int []{4,5,6,7,8};
arr[2] = new int []{9,10,11,12};


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