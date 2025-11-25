import java.util.Scanner;

public class primeNumber {

    public static void main(String[] args) {
        int flag = 1; // assume it's a prime number

        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc1.nextInt();

        if (num <= 1) {
            System.out.println("it is not prime number");
            return; // exit early for numbers <= 1
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = 0; // not a prime
                break;
            }
        }

        if (flag == 1) {
            System.out.println("it is a prime number");
        } else {
            System.out.println("it is not a prime number");
        }
    }
}