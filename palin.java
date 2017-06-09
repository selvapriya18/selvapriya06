import java.io.*;
import java.util.*;
public class palin
{
public static void main(String args[])
{
 int num=371;
 int sum=0;
 int temp;
Sytem.out.println(num);
 temp=num;
while(temp!=0)
{
sum=sum*10;
sum=sum+temp%10;
temp=temp/10;
}
if(num==sum)
{
System.out.println("This is palindrome");
}
else
{
System.out.println("This is not a palindrome");
}
}
}
