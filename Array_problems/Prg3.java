// Returning array values

class Prg3
{
public static void main(String args[])
{

int arr[]=getarray(5);
for(int val:arr)
System.out.print(val+" ");

}

static int []getarray(int size)
{
int []temparray = new int[size];
for(int i=1;i<size;i++)
{
temparray[i]=i;
}
return temparray;
}
//End of main class
}