import java.util.Scanner;
public class largestnum
{

public static void main (String args[])
{
int largest;
int a=10, b=23,c=-5;

largest= ((a>b&&a>c)?a: (b>c)?b:c);

System.out.println("Largest number: "+ largest );
}
}
