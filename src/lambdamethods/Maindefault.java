package lambdamethods;
interface MyInterface {
    default void myDefaultMethod() {

        MyFunctionalInterface myFunc = new MyFunctionalInterface() {
            @Override
            public void myMethod() {
                System.out.println("Inside lambda expression");
            }
        };

        myFunc.myMethod();
    }
}

@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod();
}

public class Maindefault implements MyInterface {
    public static void main(String[] args) {
        Maindefault mainObj = new Maindefault();
        mainObj.myDefaultMethod();
    }
}

