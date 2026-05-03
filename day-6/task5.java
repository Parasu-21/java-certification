public class task5 {
    public static void main(String[] args) {

        double[] prices = {100.5, 200.75, 150.25, 300.40};

        double[] backup = new double[prices.length];

        for(int i = 0; i < prices.length; i++)
            backup[i] = prices[i];

        System.out.println("Copied Prices:");
        for(int i = 0; i < backup.length; i++){
            System.out.println(backup[i]);
        }
    }
}
