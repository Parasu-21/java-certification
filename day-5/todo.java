import java.util.Scanner;
class todo{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the task that you want to add:");
        String task = scan.nextLine();
        display d = new display();
        d.showTask(task);
    }
}


class display{
    void showTask(String task){
        if(task.isBlank())
            System.out.println("No task added.");
        else{
            System.out.println("Your task is: " + task);
            System.out.println("Task added successfully.");
    }
}
}