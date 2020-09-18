package ru.mirea.exercise6;
import ru.mirea.exercise5.Movable;
import ru.mirea.exercise5.Point;
public class MovableRectangel extends Rectangel implements Movable {
    public MovableRectangel(Point left, Point right) {
        super(left, right);
    }
public void speedtest(){
        double xd= right.getX()- left.getX();
        double yd= right.getY()-left.getY();
        System.out.println("Длинна диагонали = "+Math.sqrt(xd*xd+yd*yd));
}
    @Override
    public void move(int x, int y) {
        left.setX(left.getX()+x);
        left.setY(left.getY()+y);
        right.setX(right.getX()+x);
        right.setY(right.getY()+y);
    }
}
