import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int f = scanner.nextInt();
        int integerOne = 100;
        int integerTwo = 10;
        final int a = f / integerOne;
        final int b = f % integerOne / integerTwo;
        final int c = f % integerTwo;
        final int sum = a + b + c;

        System.out.println(sum);


    }
}
