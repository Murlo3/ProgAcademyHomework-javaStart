import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a;
        int b;
        int c;
        int d;
        int e;
        int x;

        Scanner sc=new Scanner(System.in);

        System.out.println("Input xxxxx");

        x=sc.nextInt();

        a = x/10000;
        b = x/1000 %10;
        c = x/100 %10;
        d = x/10 %10;
        e = x%10;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }
}
