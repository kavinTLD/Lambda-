import java.util.function.Predicate;
class Mainpredicate {
    static void pred(Predicate<Integer>predicate)
    {
        if (predicate.test(10)) {
            System.out.println("Number " + 10);
        }
    }
    public static void main(String[] args)
    {
        pred((i) -> i > 1);
    }
}
