import java.util.Scanner;
class arithmeticexception{
    public static void main(String[] args){
        int a = 21;
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();

        try{
            int b = a/d;
            System.out.println("Result: "+b);
        }catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}