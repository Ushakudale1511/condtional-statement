 import java.util.*;
 class Switch {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        int button1 = sc.nextInt();

        int n= button1 ;
        switch(n)
        {
        case 1:
            System.out.print("Hello");
            break;
        case 2:
            System.out.print("namste");
            break;
        case 3:
            System.out.print("Hi");
            break;
        default :
            System.out.println("Invalid");
        }
        }

    }

    

