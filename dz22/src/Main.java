import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int a;
        int b;
        int c;
        double p;
        double s;

        System.out.println("Input a");
        a=sc.nextInt();
        System.out.println("Input b");
        b=sc.nextInt();
        System.out.println("Input c");
        c=sc.nextInt();

        System.out.println("a="+ a+',' + "b="+ b+',' + "c="+ c);

        p = (a+b+c)/2;
        s = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        System.out.println("s="+ s);
    }
}
