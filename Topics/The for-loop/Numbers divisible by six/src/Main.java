import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    int count = sc.nextInt();
    for (int i = 0; i < count; i++){
    int num = sc.nextInt();
    if (num % 6 == 0){
    sum += num;
    }
   }
    System.out.println(sum);
 } 
}
