import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integerValueOne = 1;
        int integerValueTwo = 2;
        int integerValueThree = 3;
        int n = scanner.nextInt();
        int sum = ((n + integerValueOne) * n + integerValueTwo) * n + integerValueThree;
        System.out.println(sum);


    }
}
