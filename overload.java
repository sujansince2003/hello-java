// method overloading means same function name with different args
public class overload {

    public static void main(String args[]) {
        System.out.println("hello");
        System.out.println(Sum(1, 2));
        System.out.println(Sum(1, 2, 3));
    }

    static int Sum(int a, int b) {
        return a + b;

    }

    static int Sum(int a, int b, int c) {
        return a + b + c;

    }
}