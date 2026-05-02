import java.util.Scanner;
class task1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        if(str.length() < 5) System.out.println("Short");
        else System.out.println("Long");
    }    
}
