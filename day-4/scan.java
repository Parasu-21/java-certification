import java.util.Scanner;
public class scan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.print("Enter your roll number: ");
        String rollNumber = scan.next();
        scan.nextLine();
        System.out.print("Enter email: ");
        String email = scan.nextLine();
        System.out.print("Enter age: ");
        int age = scan.nextInt();
        System.out.print("Enter phone number: ");
        long phone = scan.nextLong();
        System.out.print("Enter mark percentage: ");
        double percentage = scan.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber); 
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phone);
        System.out.println("Mark Percentage: " + percentage);

    }
}
