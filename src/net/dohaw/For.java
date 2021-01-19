package net.dohaw;

public class For {

    public static void main(String[] args){

        // 0, 1, 2, 3, 4

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        // Enhanced for loop or a For-Each Loop
        /*
            You usually use this to loop through arrays.
         */
        for(String car : cars){
            System.out.println(car);
        }

        // Regular for loop
        /*
            use this when you know the # of times you want a loop to run
         */
        for(int x = 0; x < cars.length; x++){
            System.out.println(cars[x]);
        }

    }

}
