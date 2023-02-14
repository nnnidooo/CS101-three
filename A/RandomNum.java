package A;

import D.Geometry;

import java.util.Random;

public class RandomNum {
    //Write a method that returns a random number between 1-10.
    //Call the method 10 times by using a loop.
    public static int GetRandomNumber(){
        Random random1 = new Random();
        return random1.nextInt(10)+1;
    }

    public static void main(String[] args){
        System.out.println(GetRandomNumber());
        for (int i =0; i<10; i++){
            System.out.println(GetRandomNumber());

        }
    }

}
