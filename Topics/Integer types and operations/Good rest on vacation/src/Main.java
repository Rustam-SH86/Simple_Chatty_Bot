import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int durationInDays = scanner.nextInt();
        int totalFoodCostPerDay = scanner.nextInt();
        int oneWayFlightCost = scanner.nextInt();
        int costOfOneNightInHotel = scanner.nextInt();

        totalFoodCostPerDay = totalFoodCostPerDay * durationInDays;
        oneWayFlightCost = oneWayFlightCost * 2;
        costOfOneNightInHotel = costOfOneNightInHotel * (durationInDays - 1);


        int sum = totalFoodCostPerDay + oneWayFlightCost + costOfOneNightInHotel;
        System.out.println(sum);






    }
}