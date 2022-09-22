import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n;
        int sum,first=0,last=1;
        Scanner input = new Scanner(System.in);

        System.out.print("Eleman Sayısı : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            sum= first+last;
            System.out.println(first+" + "+last+" = "+sum);
            first = last;
            last=sum;
        }
    }
}
