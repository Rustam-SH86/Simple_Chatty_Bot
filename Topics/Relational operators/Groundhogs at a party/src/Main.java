import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();
        boolean weekday = scanner.hasNextBoolean();


       // boolean party = 10 < cups && cups <= 20 && !weekday && 15 < cups && cups <= 25 && weekday;
       // System.out.println(party);

        if (10 < cups && cups <= 20 && !weekday ) {
            System.out.println(true);
            if (15 < cups && cups <= 25 && weekday) {
                System.out.println(true);
            }
        }
    }
}