import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);              
        int N = scanner.nextInt();
        int c = N / 10 % 10;
        System.out.println(c);
    }
}
