import java.util.Scanner;
public class leap
{
public static void main (String args[])

{
int num;

Scanner scan= new Scanner (System.in);
num=scan.nextInt();


if (num%4==0)
{

if (num%100==0)
{
if (num%400==0)
System.out.println(num + " is a leap year");
else
System.out.println(num+" is not a leap year");
}
else
System.out.println(num+" is a leap year");
}
else
System.out.println(num+" is not a leap year");


}



}

