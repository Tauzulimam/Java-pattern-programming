//Array passing and changing array

class Prg2
{
public static void main(String args[])
{
int arr[]={1,2,4,5,6,};

System.out.print("\nPrinting inside Main method before method calling: \n");
for(int num:arr)
{
System.out.print(num+" ");
}


printarray(arr);

System.out.print("\nPrinting inside Main method: \n");
for(int num:arr)
{
System.out.print(num+" ");
}

}

static void printarray(int []num)
{
for(int i=0;i<num.length;i++)
{
num[i]=(int)Math.pow(num[i],2);

}

System.out.print("\nPrinting inside method with for each loop: \n");
for(int value:num)
{
System.out.print(value+" ");
}

}

}