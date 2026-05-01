public class constructor {
    public static void main(String[] args) {
        samp s1 = new samp("alice");
        samp s2 = new samp("bob");

        System.out.println("Name of s1: " + s1.name1);
        System.out.println("Name of s2: " + s2.name1);
    }
}

class samp{
    String name1;
    samp(String name){
        name1 = name;
    }
}