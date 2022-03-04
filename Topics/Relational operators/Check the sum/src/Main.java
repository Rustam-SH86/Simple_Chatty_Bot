import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = 20;
        boolean sum = ((a + b) == d) || ((a + c) == d) || ((b + c) == d);
        System.out.println(sum);





    }
}