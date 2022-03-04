import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int c2 = scanner.nextInt();
        final int secondInHour = 3600;
        final int secondsInMinute = 60;
        int sum1 = secondInHour * a + secondsInMinute * b + c;
        int sum2 = secondInHour * a2 + secondsInMinute * b2 + c2;
        int sumBetween = sum2 - sum1;
        System.out.println(sumBetween);
    }
}