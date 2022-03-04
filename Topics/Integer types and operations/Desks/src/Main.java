import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grOne = scanner.nextInt();
        int grTwo = scanner.nextInt();
        int grThr = scanner.nextInt();
        int allGr = grOne / 2 + grTwo / 2 + grThr / 2;
        
        if (grOne % 2 == 1) {
            allGr++;
        }
        if (grTwo % 2 == 1) {
            allGr++;
            
        }
         if (grThr % 2 == 1) {
            allGr++;
            
        }
        System.out.println(allGr);

    }
}
