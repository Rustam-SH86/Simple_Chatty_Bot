import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int poleHeight = scanner.nextInt();
        int feetUpPerDay = scanner.nextInt();
        int feetDownPerNight = scanner.nextInt();
        int dayOfReach = 1;

        for (int i = feetUpPerDay; i < poleHeight; i = i + (feetUpPerDay - feetDownPerNight)) {
            dayOfReach++;
        }

        System.out.println(dayOfReach);

    }
}