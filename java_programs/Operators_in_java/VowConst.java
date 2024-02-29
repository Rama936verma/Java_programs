
import java.util.*;
class VowConst 
{
public static void main(String args[])
{
char ch ;
Scanner sc =new Scanner(System.in);
System.out.println("enter a alphabet :");
ch=sc.next().charAt(0);
switch(ch)
{
	     case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel.");
                break;
default:
                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                    System.out.println(ch + " is a consonant.");
                } else {
                    System.out.println("Invalid input. Please enter an alphabet character.");
                }

}
}
}