import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = 0;


        for (int i = 0;i < n; i++ ) {
            int numbers = scanner.nextInt();
            if (numbers % 4 == 0 && numbers > max ) {
               max=numbers;
            }
        }
        System.out.println(max);
    }
}