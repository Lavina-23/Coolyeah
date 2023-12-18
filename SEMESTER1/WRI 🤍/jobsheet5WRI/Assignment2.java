import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String menu;
        int price, total, shipCost, delivery, totalShipCost = 0;
        
        System.out.print("Enter a food name : ");
        menu = sc.nextLine();
        System.out.print("Input the food price : ");
        price = sc.nextInt();
        System.out.print("Do you want express delivery (0 = no, 1 = yes) ? ");
        delivery = sc.nextInt();

        if (price > 100_000) {
            shipCost = 20_000;
            if (delivery == 1) {
                totalShipCost = shipCost+25_000;
            } else if (delivery == 0) {
                totalShipCost = shipCost;
            }
        } else {
            shipCost = 30_000;
            if (delivery == 1) {
                totalShipCost = shipCost+25_000;                
            } else if (delivery == 0) {                
                totalShipCost = shipCost;
            }
        }
        System.out.println("RECEIPT");
        System.out.println(menu + "\t\t\t" + price);
        System.out.println("Shipping Cost\t\t" + totalShipCost);
        total = price+totalShipCost;
        System.out.println("Total\t\t\t" + total);
    }
    
}
