package ru.mirea.exercise6;
import ru.mirea.exercise5.Point;
public class Rectangel {
    Point left;
    Point right;
    public Rectangel(Point left, Point right) {
        this.left = left;
        this.right = right;
    }
    public Point getLeft() {
        return left;
    }

    public Point getRight() {
        return right;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}
