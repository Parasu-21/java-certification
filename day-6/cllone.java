import java.util.Arrays;
class cllone{
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int b[] = a.clone();
        int c[] = new int[5];
        int d[] = Arrays.copyOf(a,5);

        System.arraycopy(a,0,c,0,3);
        for(int i = 0 ; i < a.length ; i ++) System.out.print(a[i]+" ");
        System.out.println();
        for(int i = 0 ; i < c.length ; i ++) System.out.print(c[i]+" ");
        System.out.println();
        for(int i = 0 ; i < d.length ; i ++) System.out.print(d[i]+" ");
        System.out.println();
    }
}