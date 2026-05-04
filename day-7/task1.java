public class task1 {
    public static void main(String[] args) {

        String firstName = "Arun";
        String city = "Chennai";
        String hobby = "Cricket";

        StringBuilder sb = new StringBuilder();

        sb.append(firstName)
          .append(" FROM ")
          .append(city)
          .append(" LOVES ")
          .append(hobby);

        String result = sb.toString().toUpperCase();

        System.out.println(result);
    }
}