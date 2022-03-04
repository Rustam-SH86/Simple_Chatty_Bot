import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int num = scanner.nextInt();
        int numOne = num % 10;
        int numTwo = (num % 100) / 10;
        int numTree = num / 100;

        if (numOne == 0) {
            System.out.println();
        } else {
            System.out.print(numOne);
        }
        System.out.print(numTwo);
        System.out.print(numTree);



    }
}
