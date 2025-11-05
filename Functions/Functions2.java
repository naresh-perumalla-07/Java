package Functions;

public class Functions2 {
    //Static and Non Staticfdssdfsdfasdfasdf

    static void staticMethod() {
        System.out.println("I am static!");
    }

    void nonStaticMethod() {
        System.out.println("I am non-static!");
    }

    public static void main(String[] args) {
         Functions2.staticMethod();  // directly call

         Functions2 obj = new Functions2();  // create object
        obj.nonStaticMethod();
    }
}
