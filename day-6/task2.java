import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        int[] patientIDs = {201, 202, 203, 204, 205};
        int searchID;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter patient ID to search: ");
        searchID = scan.nextInt();
        boolean found = false;
        for(int i = 0; i < patientIDs.length; i++){
            if(patientIDs[i] == searchID){
                found = true;
                break; }}
        if(found)
            System.out.println("Patient ID found");
        else
            System.out.println("Patient ID not found");
    }
}