import java.util.Scanner;
class work {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 1, 2};
        Scanner scan = new Scanner(System.in);
        int target = scan.nextInt();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.println("Found at index: " + i);
                break;
            }
        }

        int temp = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
