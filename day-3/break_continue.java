import java.util.Scanner;
public class break_continue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for(int i = 1 ; i <= 10; i++) {
            if(i%2 == 0) 
                continue;
            System.out.println(i);
            // if(i%2 == 0) 
            //     break;
            // System.out.println(i);
        }
    }
}
