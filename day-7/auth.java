import java.util.Scanner;
class auth{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter username : ");
        String username = scan.next();
        System.out.print("Enter password : ");
        int password = scan.nextInt();
        data obj = new data();
        if(obj.check(username,password)) System.out.println("Login successful");
        else System.out.println("Login failed");

    }
}

class data{
    private String name = "admin";
    private int pass = 2006;

    boolean check(String user , int pswd){
        if(user.equals(name) && pswd == pass) return true;
        return false;
    }
}