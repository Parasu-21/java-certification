class string{
    public static void main(String[] args) {
        String str1 = "abc";//go to scp and check if "abc" is present or not, if not then create a new object and store "abc" in it and return the reference of that object, if present then return the reference of that object
        String str2 = "abc";
        System.out.println(str1 == str2);//compare the reference of str1 and str2, it will return true because both str1 and str2 are referring to the same object in the string pool
        String str3 = new String("abc");//create a new object in the heap and store "abc" in it and return the reference of that object
        System.out.println(str1 == str3);//compare the reference of str1 and str3, it will return false because str1 is referring to the object in the string pool and str3 is referring to the object in the heap
        System.out.println(str1.equals(str3));//compare the content of str1 and str3
    
    }
}