package JavaBasics;

public class ControlStatements {
    public static void main(String[] args){

        int marks = 75;

        if(marks >= 90){
            System.out.println("Grade: A");
        } else if(marks >= 75){
            System.out.println("Grade: B");
        } else if(marks >= 50){
            System.out.println("Grade: C");
        } else {
            System.out.println("Fail");
        }


        int age = 25;
        boolean hasID = true;

        if(age >= 18){
            if(hasID){
                System.out.println("Allowed to vote");
            } else {
                System.out.println("ID required");
            }
        } else {
            System.out.println("Not eligible");
        }

    }
    
}
