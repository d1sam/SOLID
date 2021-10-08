package ua.od.atomspace;

//пример как нарушается принцип подстановки Барбары Лисков, так как изменяется поведение родительского класса
//сутью является то, что нужно, чтобы вместо объекта родительского класса можно было подставить объект дочернего класса и логика не изменилась

public class Main {
    public static Rectangle getRect() {
        return new Square();
    }

    public static void main(String[] args) {
        Rectangle rectangle = getRect();
        rectangle.setHeight(5);
        rectangle.setWidth(10);
        System.out.println("Площадь = " + rectangle.getSquare());
    }
}

class Rectangle {
    protected int height;
    protected int width;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getSquare() {
        return height * width;
    }
}

class Square extends Rectangle {

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }
}
