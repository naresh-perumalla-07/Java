package JavaBasics;

public class JumpStatements {
    public static void main(String[] args) {

        //Break Statement

        for (int i = 1; i <= 5; i++) {
            if (i == 3)
                break;
            System.out.println(i);
        }


        //Continue Statement

        for(int i = 1; i <= 5; i++){
            if(i == 3){
                continue; // i==3 skip avutundi
            }
            System.out.println(i);
        }


    }
}