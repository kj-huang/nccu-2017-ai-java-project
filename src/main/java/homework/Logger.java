package homework;

import java.util.ArrayList;

public class Logger {
    public Logger(ArrayList<Point> points) {
        for (Point p: points){
            System.out.print(printLocation(p));
        }
        System.out.println();
    }

    public String printLocation(Point p){
        return "(" + p.getX() + "," + p.getY() + ") ";
    }
}
