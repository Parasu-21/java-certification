import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if(str.startsWith("Java")) System.out.println("Yes");
        else System.out.println("No");
    }
}
