package net.dohaw;

public class Switch {

    public static void main(String[] args){

        MathOperators mathOp = null;
        switch(mathOp){

            case ADDITION:
                System.out.println("THIS IS ADDITION");
                break;
            case SUBTRACTION:
                System.out.println("THIS IS SUBTRACTION");
                break;
            case DIVISION:
                System.out.println("THIS IS DIVISION");
                break;
            default:
                System.out.println("DEFAULT");
                break;

        }

    }

}
