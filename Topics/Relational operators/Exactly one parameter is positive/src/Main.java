import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);             
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        boolean result;
        result = A > 0 && B <= 0 && C <= 0 || A <= 0 && B > 0 && C <= 0 || A <= 0 && B <= 0 && C > 0;
        System.out.println(result);
    }
}
