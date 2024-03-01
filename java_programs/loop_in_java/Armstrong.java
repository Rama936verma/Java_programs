import java.util.*;
class Armtrong
{
public static void main(String arg[])
{
int n,rem,sum=0;

Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int temp=n;
for( ;n>0;n=n/10)
{
rem=n%10;
sum=sum+rem*rem*rem;

}
System.out.println(sum);

if(temp==sum)
{
System.out.println("armstrong no.");
}
else
{
System.out.println("not armstrong");
}
}
}