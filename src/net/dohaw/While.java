package net.dohaw;

public class While {

    public static void main(String[] args){

        int num1 = 2;
        int num2 = 0;

        //THIS RUNS CODE AND THEN CHECKS CONDITION
        do{
            //run whatever is here while num1 is greater than num2
            num2++;
            System.out.println("I AM RUNNING");
        }while(num1 < num2);

        //THIS CHECKS CONDITION THEN RUNS CODE
        while(num1 < num2){
            //run whatever is here while num1 is greater than num2
            num2++;
            System.out.println("I AM RUNNING");
        }

    }

}
