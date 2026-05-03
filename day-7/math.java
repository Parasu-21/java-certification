import java.util.*;
class math{
    public static void main(String[] args) {
        Random r = new Random();
        int n = -21;
        double a = r.nextDouble(100);
        double b = r.nextDouble(100);
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("Abs : " + Math.abs(n));
        System.out.println("Max : " + Math.max(a,b));
        System.out.println("Min : " + Math.min(a,b));
        System.out.println("Sqrt : "+Math.sqrt(a));
        System.out.println("Cbrt : " + Math.cbrt(a)); 
        System.out.println("Pow : " + Math.pow(a, b));
        System.out.println("Round : " + Math.round(a));
        System.out.println("Ceil : "+Math.ceil(a));
        System.out.println("Floor : " + Math.floor(a));
        double rad = Math.toRadians(a);
        System.out.println("Sin : "+Math.sin(rad));
        System.out.println("Cos : "+Math.cos(rad));
        System.out.println("Tan : "+Math.tan(rad));
        
    }
}