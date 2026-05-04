import java.util.Random;

public class task3{
    public static void main(String[] args) {

        String[] customers = {"Arun", "Bala", "Cathy", "Divya", "Eshan"};

        Random rand = new Random();

        int index = rand.nextInt(customers.length);

        System.out.println("Winner is: " + customers[index]);
    }
}