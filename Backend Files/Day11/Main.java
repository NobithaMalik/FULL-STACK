package Day11;
interface MyInterface {
    void method1();
}

class MyClass implements MyInterface {
    public void method1() {
        System.out.println("Method 1 implementation in MyClass");
    }

    public void method2() {
        System.out.println("Method 2 specific to MyClass");
    }
}

public class Main {
    public static void main(String[] args) {
        MyInterface obj = new MyClass();
        obj.method1();  

    }
}
