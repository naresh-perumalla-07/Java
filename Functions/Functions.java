package Functions;

public class Functions {


    //Syntax cvcdf

    // returnType methodName(parameters) {
    // // body
    // return value;  // if returnType is not void
    // }


       // method without parameters
    public static void sayHello() {
        System.out.println("Hello, Java!");
    }

    // method with parameters
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        sayHello();  // calling method
        int sum = add(5, 7);
        System.out.println("Sum = " + sum);
    }
    int mul(int c, int d) {
        return c * d;
    }

    double mul(double a, double b) {
        return a * b;
    }

    

}
