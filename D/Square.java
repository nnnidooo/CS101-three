package D;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Square implements Comparable<Square> {
    private Double width;
    private Double height;

    public Square(Double width, Double height) {
        this.width = width;
        this.height= height;
    }
    public double getPerimeter() {
        return 2*(width+height);
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    //implementing the compareTo method.
    @Override
    public int compareTo(Square comparingSquare) {
        if(this.getPerimeter() > comparingSquare.getPerimeter()){
            return -1;
        } else {
            return 1;
        }

    }

    public static void main(String[] args) {

        Square square1 = new Square(2.0,7.0);
        Square square2 = new Square(3.0,12.0);
        Square square3 = new Square(23.0,8.0);


        ArrayList<Square> squares = new ArrayList<>();
        squares.add(square1);
        squares.add(square2);
        squares.add(square3);
        Collections.sort(squares);


        for (Square square : squares){
            System.out.println("Perimeter " + square.getPerimeter());
        }


    }
}
