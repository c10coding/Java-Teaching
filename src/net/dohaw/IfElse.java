package net.dohaw;

public class IfElse {

    public static void main(String[] args){

        boolean condition = 2 > 0;
        int num1 = 2;
        int num2 = 0;

        // If else if else
        if(num1 == num2) {
            System.out.println("I AM TRUE");
        }else if(num1 < num2) {
            System.out.println("I AM HERE");
        }else if(num1 <= num2){
            System.out.println("I AM HERE2");
        }else{
            System.out.println("I AM FALSE");
        }

        // single line if statement (Sort of)
        String str = num1 > num2 ? "RANDOM THING" : "ANOTHER RANDOM THING";
        Utils.print(str);
    }

}
