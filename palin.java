import java.io.*;
import java.util.*;
public class palin
{
public static void main(String args[])
{
 int num,sum=0;
Scanner s=new Scanner(System.in);
int n=s.nextInt();
while(num>0)
{
num=num%10;
sum=sum+num*num*num;
num=num/10;
}
if(sum==0)
{
System.out.println("This is palindrome");
}
else
{
System.out.println("This is not a palindrome");
}
}
}
