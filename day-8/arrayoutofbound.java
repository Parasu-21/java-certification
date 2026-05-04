class arrayoutofbound {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        String s[] = {};
        
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        try {
            for(int i = 0 ; i <= arr.length ; i++)
            System.out.println(arr[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        
        try {
            System.out.println(s[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

    }
}
