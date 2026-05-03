import java.util.Arrays;
public class task4 {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40};

        int[] copy1 = numbers.clone();
        int[] copy2 = Arrays.copyOf(numbers, numbers.length);
        int[] copy3 = new int[numbers.length];
        System.arraycopy(numbers, 0, copy3, 0, numbers.length);

        System.out.println("Original: " + Arrays.toString(numbers));
        System.out.println("Clone Copy: " + Arrays.toString(copy1));
        System.out.println("Arrays.copyOf: " + Arrays.toString(copy2));
        System.out.println("System.arraycopy: " + Arrays.toString(copy3));
    }
}
