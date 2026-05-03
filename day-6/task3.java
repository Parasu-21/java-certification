import java.util.Arrays;
public class task3 {
    public static void main(String[] args) {

        int[] bookIDs = {45, 12, 78, 34, 23};

        Arrays.sort(bookIDs);

        System.out.println("Sorted Book IDs:");
        for(int id : bookIDs){
            System.out.println(id);
        }
    }
}

