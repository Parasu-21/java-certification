class stringb {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");
        sb.append("hello ");
        sb.append(21);
        sb.append(" ");
        sb.append(21.5);
        sb.append(" ");
        sb.append(true);
        sb.append(" ");
        sb.insert(6,"world");sb.insert(11," ");
        System.out.println(sb);
        sb.delete(5,10);
        System.out.println(sb);
        sb.deleteCharAt(7);
        System.out.println(sb);
        sb.replace(0,5,"v");
        System.out.println(sb);
        System.out.println(sb.indexOf("21"));
        String str = sb.substring(2,5);
        System.out.println(str);
        System.out.println(sb.reverse());
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.trimToSize();
        System.out.println(sb.capacity());

    }
}
