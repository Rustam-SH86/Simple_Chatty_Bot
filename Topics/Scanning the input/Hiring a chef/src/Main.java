import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String cuisine = scanner.next();
        String  years = scanner.next();
        
        
        
        System.out.println("The form for " + name + " is completed. We will contact you if we need a chef who cooks " + years + " dishes and has " + cuisine + " years of experience.");
        
    }
}
