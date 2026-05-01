public class StringMethodsDemo {
    public static void main(String[] args) {

        String s1 = "Hello World";
        String s2 = "Java Programming";
        String s3 = "HELLO WORLD";
        String s4 = "   Java   ";

        System.out.println("Length: " + s1.length());

        System.out.println("Character at index 4: " + s1.charAt(4));

        System.out.println("Substring (0,5): " + s1.substring(0,5));

        System.out.println("Concat: " + s1.concat(" Welcome"));

        System.out.println("Equals: " + s1.equals(s3));

        System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s3));

        System.out.println("CompareTo: " + s1.compareTo(s2));

        System.out.println("Uppercase: " + s1.toUpperCase());

        System.out.println("Lowercase: " + s3.toLowerCase());

        System.out.println("Trim: '" + s4.trim() + "'");

        System.out.println("Replace: " + s1.replace("World", "Java"));

        System.out.println("Contains 'Hello': " + s1.contains("Hello"));

        System.out.println("Starts with 'He': " + s1.startsWith("He"));

        System.out.println("Ends with 'ld': " + s1.endsWith("ld"));

        System.out.println("Index of 'o': " + s1.indexOf('o'));
    
        System.out.println("Last index of 'o': " + s1.lastIndexOf('o'));

        String s5 = "  ";
        System.out.println("Is Empty: " + s5.isEmpty());
        System.out.println("Is Blank: " + s5.isBlank());


    }
}