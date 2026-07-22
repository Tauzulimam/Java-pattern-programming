//Reversing an array using pointer value method

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
int []Arr={1,2,3,4,5,6,};

System.out.print("Before: \n");
for(int val:Arr)
System.out.print(val+" ");

Arr=Sort.reverseArray(Arr);

System.out.print("\nAfter : \n");
for(int val:Arr)
System.out.print(val+" ");

}//ENd of main
}