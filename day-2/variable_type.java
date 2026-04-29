public class variable_type {
    public static void main(String[] args) {
        samp o = new samp();
        o.add();

        System.out.println(o.a);
        System.out.println(samp.b);
    }
}

//static variable belongs to class and non static variable belongs to object. we can access static variable by using class name but we can access non static variable by using object reference.
//we can access static variable by using object reference but it is not recommended because it will create confusion. we can access non static variable by using class name but it is not recommended because it will create confusion.
//only static variable can be accessed in static method and both static and non static variable can be accessed in non static method.
//static variable is initialized only once at the time of class loading and non static variable is initialized every time when object is created.
//static variable is shared among all objects of the class and non static variable is unique for each object of the class.
//static variable is also called class variable and non static variable is also called instance variable.
//static variable is stored in static memory area and non static variable is stored in heap memory area.
//static variable is also called class variable because it belongs to class and non static variable is also called instance variable because it belongs to object.

class samp{
    int a = 1;
    static int b = 20;
    
    void add(){
        final int var = 151;
        int a = 10;
        System.out.println(a);
        System.out.println(var);
    }
}
