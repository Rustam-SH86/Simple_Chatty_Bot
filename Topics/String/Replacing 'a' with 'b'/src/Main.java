import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String r = str.replace("a", "b");
        System.out.println(r);

    }
}
