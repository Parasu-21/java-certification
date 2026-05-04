class nullpointer {
    public static void main(String[] args){
        String studentName  = null;
        try {
            System.out.println(studentName .length());
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
