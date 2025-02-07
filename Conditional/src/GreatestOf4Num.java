import java.util.Scanner;

public class GreatestOf4Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a four numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if(a>b && a>c && a>d)
        {
            System.out.println("Largest :"+a);
        }
        else if(a<b && c<b && b>d)
        {
            System.out.println("Largest :"+b);
        } else if (a<d && c<d && d>b)
        {
            System.out.println("Largest :"+d);
        } else
        {
            System.out.println("Largest :"+c);
        }
    }
}
