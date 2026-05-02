import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String arr[] = new String[3];
        for(int i = 0 ; i < 3 ; i++){
            System.out.print("Enter task "+(i+1)+" : ");
            arr[i] = scan.nextLine();
        }
        System.out.println("Daily tasks:");
        for(int i = 0 ; i < 3 ; i++){
            System.out.println(arr[i]);
        }
    }
}
