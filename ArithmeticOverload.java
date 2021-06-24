//11. Program to find sum using method overloading.
public class ArithmeticOverload {
    static int add(int a,int b) {
        int res = a + b;
        return res;
    }
    static int add(int a,int b,int c) {
        int res = a + b + c;
        return res;
    }
    static int add(int a, int b, int c, int d) {
        int res = a + b + c + d;
        return res;
    }
    public static void main(String[] args) {
        System.out.println(add(3,4));
        System.out.println(add(3,4,6));
        System.out.println(add(4,5,6,7));
    }
}
