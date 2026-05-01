import java.util.Scanner;
class expenses {
    public static void main(String[] args) {
        System.out.println("Welcome to the Expense Tracker!");
        Scanner scan = new Scanner(System.in);
        double total = 0;
        int choice;
        do{
            System.out.print("Enter expense name : ");
            String name = scan.nextLine();
            System.out.print("Enter expense price: ");
            double price = scan.nextDouble();
            System.out.print("Do you want to add another expense? (1 = yes / 0 = no): ");
            choice = scan.nextInt();
            scan.nextLine();
            total += price;
        }while(choice != 0);
        System.out.println("Total expenses: " + total);
    }
}
