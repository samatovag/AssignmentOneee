package models;

import java.util.ArrayList;
public class Shape {
    private ArrayList<Point> array;
    public Shape() {
        array = new ArrayList<Point>();
    }
    public void addPoint(Point point) {
        array.add(point);
    }

    public double perimeter() {
        double perim = 0.0;
        for(int i = 0; i < 9; i++) {
            perim += array.get(i).distanceTo(array.get(i + 1));
        }
        perim += array.get(0).distanceTo(array.get(9));
        return perim;
    }

    public double getLongestSide() {
        double max = 0;
        double current;
        for(int i = 0; i < 9; i++) {
            current =
                    array.get(i).distanceTo(array.get(i+1));
            if(current > max) {
                max = current;
            }
        }
        current = array.get(0).distanceTo(array.get(9));
        if(current > max) {
            max = current;
        }
        return max;
    }

    public double getAverageSide() {
        return perimeter()/10;
    }
}