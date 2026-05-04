import java.util.*;

public class task1_1{
    public static void main(String[] args) {

        Random r = new Random();
        int studentID = r.nextInt(1000);
        double marks = r.nextDouble() * 100;
        float attendance = r.nextFloat() * 100;
        boolean status = r.nextBoolean();       
        long regNo = r.nextLong();
        double performance = r.nextGaussian() * 10;
        byte[] bytes = new byte[5];
        r.nextBytes(bytes);

        System.out.println("Student ID: " + studentID);
        System.out.println("Marks: " + marks);
        System.out.println("Attendance: " + attendance);
        System.out.println("Status (Pass=true / Fail=false): " + status);
        System.out.println("Registration Number: " + regNo);
        System.out.println("Performance Score: " + performance);
        System.out.println("Random Bytes: " + Arrays.toString(bytes));

        System.out.println("5 Random Numbers:");
        r.ints(5).forEach(System.out::println);
    }
} 
    
