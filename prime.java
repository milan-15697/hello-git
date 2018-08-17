import java.util.Scanner;

class prime {

  public static void main(String[] args) {

int number,flag=0;

    Scanner scan= new Scanner(System.in);
    number=scan.nextInt();

for (int i=2;i<=number/2;i++)
{
  if (number%i==0)
  {
    flag=1;
  }
}

if (flag==0)
    System.out.println(number +" is Prime");
    else
    System.out.println(number+ " is not Prime");
  }
}
