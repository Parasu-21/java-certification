import java.util.Scanner;
public class Scanuse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            n = sc.nextInt();
            System.out.println("You entered: " + n);
        }while(n!=0);
    }
}
