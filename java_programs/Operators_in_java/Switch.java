
import java.util.*;
class Switch 
{
public static void main(String args[])
{
int num ;
Scanner sc =new Scanner(System.in);
System.out.println("enter a number :");
num=sc.nextInt();
Switch(num)
{
case 1:
System.out.println("first");
break;

case 2:
System.out.println("second");
break;

case 3:
System.out.println("third");
break;
default:
System.out.println("invalid");

}
}
}