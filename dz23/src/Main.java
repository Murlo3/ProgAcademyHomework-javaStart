import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int r;
        double l;


        System.out.println("Input r");
        r=sc.nextInt();

        System.out.println("r="+ r);

        l = 2 * Math.PI * r;

        System.out.println("l="+ l);
    }
}
