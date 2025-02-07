import java.util.Scanner;

public class GreatestOf3Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b&&a>c)
        {
            System.out.println("Largest :"+a);
        }
        else if(a<b&&c<b)
        {
            System.out.println("Largest :"+b);
        }
        else
        {
            System.out.println("Largest :"+c);
        }
    }
}
