
import java.util.*;
class Calc 
{
public static void main(String args[])
{
 int a,b,c;
char ch;
Scanner sc =new Scanner(System.in);
System.out.println("enter a first number :");
a=sc.nextInt();
System.out.println("enter a second number :");
b=sc.nextInt();
System.out.println("enter your choice :");
ch=sc.next().charAt(0);
switch(ch)
{
	     case '+':
		c=a+b;
		System.out.println("addition:"+c);
break;

	     case '-':
		c=a-b;
		System.out.println("subtraction:"+c);
break;
default:
	     
		System.out.println("try again");

              

}
}
}