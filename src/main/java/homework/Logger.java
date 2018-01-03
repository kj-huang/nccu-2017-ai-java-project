package homework;

import java.util.ArrayList;

public class Logger {
    public Logger(Point startPoint, ArrayList<Point> points) {
        System.out.print(printLocation(startPoint));
        for (Point p: points){
            System.out.print(printLocation(p));
        }
        System.out.println(';');
    }

    public String printLocation(Point p){
        return "(" + p.getX() + "," + p.getY() + ")";
    }
}
