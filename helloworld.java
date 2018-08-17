public class helloworld {

public static void main (String [] args)
{ int flag;
    /*
    int x =5;
    String name;
   switch(x)
    {

        case 1:
            System.out.println("1");
            break;

            case 2:
            System.out.println("2");
            break;

            case 3:
             System.out.println("3");
             break;


        default:

        System.out.print("Default"+" ");
       break;


    }

    for (int i=0;i<10;i++)
    {
        System.out.print(i+" ");
    }


    Scanner scan= new Scanner(System.in);
    name=scan.nextLine();
    System.out.print("Hello "+name);

    double sal=0;
    Scanner sc= new Scanner(System.in);
    sal=sc.nextDouble();
    System.out.print("Salary "+sal);


    for (int i=0;i<4;i++)
    {

        for (int j=0;j<i+1;j++ )
        {
            System.out.print("*");
        }
        System.out.print("\n");


    }
*/


for (int j=2;j<=100;j++)
{
  flag=1;
    for (int i=2;i<=j/2;i++) {
        if (j % i == 0) {
            flag = 0;
            break;
        }
    }

if (flag==1) {
    System.out.println(j + " Prime");
}



    }
}



}

