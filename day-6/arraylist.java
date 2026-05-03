import java.util.ArrayList;
class arraylist {
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Character> ch = new ArrayList<>();

        ch.add('A');
        ch.add('z');
        ch.add('b');
        ch.add('Z');
        ch.add('Y');

        arr.add(21);
        arr.add(18);
        arr.add(16);

        System.out.println(arr);
        arr.set(1,51);
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);

        System.out.println(arr.contains(21));
        System.out.println(arr.contains(51));
        arr.sort(null);
        ch.sort(null);
        System.out.println(arr);
        System.out.println(ch);
    }
}
