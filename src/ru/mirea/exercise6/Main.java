package ru.mirea.exercise6;
import ru.mirea.exercise5.Point;
public class Main {

    public static void main(String[] args) {
        MovableRectangel movableRectangel=new MovableRectangel(new Point (0,2),new Point (2,0));
        System.out.println(movableRectangel);
        movableRectangel.speedtest();
        movableRectangel.move(2,2);
        System.out.println(movableRectangel);
        movableRectangel.speedtest();
    }
}