import java.util.Scanner;
class factorial
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int fact=1;
System.out.println("enter your number to find fctorial :");

int num=sc.nextInt();

for(int i=1;i<=num;i++)
{
fact=fact*i;
}

System.out.println("factorial of  "+ num+ " is " +fact);
}
}