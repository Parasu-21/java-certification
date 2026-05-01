class diff_type_cons{
    public static void main(String args[]){
        constructor c1 = new constructor();
        constructor c2 = new constructor("Alice");
        constructor c3 = new constructor(c2);
    }
}

class constructor{
    String name1 , name2;
    constructor(){
        System.out.println("Object created using default constructor");
    }

    constructor(String name){
        name1 = name;
        System.out.println("Object created using parameterized constructor ||"+name1);
    }

    constructor(constructor obj){
        name2 = obj.name1;
        System.out.println("Object created using copy constructor || "+name1+"  "+name2);
    }
}