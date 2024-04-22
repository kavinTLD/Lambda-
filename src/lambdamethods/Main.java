package lambdamethods;
interface MyFunction {
    int operate(int a, int b);
}

public class Main {
    public static void main(String[] args) {

        MyFunction add = Integer::sum;

        int result = add.operate(10, 20);

        System.out.println("Result: " + result);
    }
}
