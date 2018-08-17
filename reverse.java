import java.util.Scanner;
 class reverse
{
public static void main (String args[])
{
int number;
Scanner scan = new Scanner (System.in);
number=scan.nextInt();

int temp,ld,rev=0;
temp=number;

while (temp!=0)
{
ld=temp%10;
rev=rev*10+ld;
temp=temp/10;
}

System.out.println(rev);
}
}
