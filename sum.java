import java.util.Scanner;
public class sum
{
public static void main (String args[])
{
int number;
Scanner scan = new Scanner (System.in);
number=scan.nextInt();

int temp,ld,sum=0;
temp=number;

while (temp!=0)
{
ld=temp%10;
sum=sum+ld;
temp=temp/10;
}

System.out.println(sum);
}
}
