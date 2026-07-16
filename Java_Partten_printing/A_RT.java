//Different Alphabet right angle triangle

class A_RT
{
public static void main(String args[])
{
int num=7;
for(int row=1;row<=num;row++)
{
for(int col=1;col<=row;col++)
{
int a=num-col;
int b='A'+a;
char ans = (char)b;
System.out.print(ans+" ");
}//End of col
System.out.println();
}//End of row

}		//End of main class...
}	//End of a_rt