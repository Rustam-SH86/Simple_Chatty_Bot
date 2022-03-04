import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long result = 1L;
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i < b; i++) {
        result *= i;
        }
        System.out.println(result);
      }
 }
