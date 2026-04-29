public class election {
    public static void main(String args[]) {
        int age = 25;
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        String candidate = "Alice";
        if (candidate.equals("Alice")) {
            System.out.println("You voted for Alice.");
        } else if (candidate.equals("Bob")) {
            System.out.println("You voted for Bob.");
        } else {
            System.out.println("You voted for an unknown candidate.");
        }
}
}
