//Reversing an array using pointer value method
import java.util.Scanner;

class Sort
{
static int []reverseArray(int arr [])
{
int left=0, right=arr.length-1;

while(left<right)
{
int temp=arr[left];
arr[left]=arr[right];
arr[right]=temp;
left++;
right--;
}
return arr;
}
}

class Main
{
public static void main(String args[])
{

Scanner sc = new Scanner(System.in);
System.out.print("Enter the size of Array: ");
int size=sc.nextInt();
int []Arr = new int[size];

//input of array
System.out.print("Enter the array elements: \n");
for(int i=0;i<Arr.length;i++)
Arr[i]=sc.nextInt();

System.out.print("Before: \n");
for(int val:Arr)
System.out.print(val+" ");

Arr=Sort.reverseArray(Arr);

System.out.print("\nAfter: \n");
for(int val:Arr)
System.out.print(val+" ");

}//ENd of main
}