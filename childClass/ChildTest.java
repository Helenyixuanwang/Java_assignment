public class ChildTest {
    // Driver class

    public static void main(String[] args)
    {
        Parent obj1 = new Parent();
        obj1.m2();
        // obj1.m1(); //the method m1() from type Parent is not visible
        Parent obj2 = new Child();
        obj2.m2();
        // obj2.m1();
    }
}

/*
In any object-oriented programming language, Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes. When a method in a subclass has the same name, same parameters or signature, and same return type(or sub-type) as a method in its super-class, then the method in the subclass is said to override the method in the super-class.

The version of a method that is executed will be determined by the object that is used to invoke it. If an object of a parent class is used to invoke the method, then the version in the parent class will be executed, but if an object of the subclass is used to invoke the method, then the version in the child class will be executed. In other words, it is the type of the object being referred to (not the type of the reference variable) that determines which version of an overridden method will be executed.

Overriding and Access-Modifiers : The access modifier for an overriding method can allow more, but not less, access than the overridden method. For example, a protected instance method in the super-class can be made public, but not private, in the subclass. Doing so, will generate compile-time error. 
In this examle, the m1 method in Parent is made private which has cause it is not visible in Child class. A protected method m2() in type Parent is made public in Child class. The access modifier can not be lowered in Child class.

*/

