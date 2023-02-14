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

    //implementing the compareTo method.
    @Override
    public int compareTo(Square o) {
        return 0;
    }

    public static void main(String[] args) {
        List<Square> squares = new ArrayList<>();
        squares.add(new Square(2.0, 7.0));
        squares.add(new Square(3.0, 12.0));
        squares.add(new Square(23.0, 8.0));
        Collections.sort(squares);

        for (Square square : squares){
            System.out.println("Perimeter " + square.getPerimeter());
        }
    }
}
