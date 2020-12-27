package com.annyshik;

class Dog {
    public String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Paw {
    public String paw;

    public Paw(String paw) {
        this.paw = paw;
    }
}

class Voice {
    public String sayVoice;

    public Voice(String sayVoice) {
        this.sayVoice = sayVoice;
    }
}
////////////////////

class Point { //класс точка (математическая, двухмерная)
    private double corX;
    private double corY;

    /***конструктор принимает координаты
     //гетеры и сеттеры для координат*/
    public Point(double x, double y) {
//        this.corX = corX;
//        this.corY = corY;
        corX = x;
        corY = y;
    }

    public double getCorX() {
        return corX;
    }

    public void setCorX(double corX) {
        this.corX = corX;
    }

    public double getCorY() {
        return corY;
    }

    public void setCorY(double corY) {
        this.corY = corY;
    }

    /***метод проверки лежит ли точка в начале координат (возвращает true или false)    */
    public boolean pointAtTheOrigin() {
        return corX == 0 && corY == 0;
    }

    /***метод для вывода точки в консоль*/
    public void corToConsole() {
        System.out.println(corX + ", " + corY);
    }

    /***Нахождение длины отрезка между точкой lengthToDot и началом координат по теореме Пифагора*/
    public double lengthToDot(com.annyshik.Point point) {
        return Math.sqrt(Math.pow(point.corX - corY, 2) + Math.pow((point.corY - corY), 2));
    }
}

class Circle { //класс окружность
    /***конструктор принимает точку-центр и радиус*/
    private com.annyshik.Point centerCircle;
    private double radiusCircle;

    public Circle(com.annyshik.Point centerCircle, double radiusCircle) {
        this.centerCircle = centerCircle;
        this.radiusCircle = radiusCircle;
    }

    /*** метод проверки лежит ли точка в этой окружности
     //Сравнение полученного значения с радиусом круга.*/
    public boolean containsPoint(com.annyshik.Point p) {

        boolean itPointInCercle = radiusCircle >= p.lengthToDot(centerCircle);
        return itPointInCercle;

    }

    /***геттеры и сеттеры для всех полей*/
    public com.annyshik.Point getCenterCircle() {
        return centerCircle;
    }

    public void setCenterCircle(com.annyshik.Point centerCircle) {
        this.centerCircle = centerCircle;
    }

    public double getRadius() {
        return radiusCircle;
    }

    public void setRadius(double radiusCircle) {
        this.radiusCircle = radiusCircle;
    }
}

public class Main {
    public static void task1() {
        com.annyshik.Dog dog = new com.annyshik.Dog("Бобик");

        com.annyshik.Paw givePaw = new com.annyshik.Paw("подал лапу");
        com.annyshik.Voice castVoice = new com.annyshik.Voice("Гав!");

        System.out.println(dog.name + " " + givePaw.paw);
        System.out.println(castVoice.sayVoice);
    }

    public static void task2() {
        com.annyshik.Point[] allPoints = {
                new com.annyshik.Point(6, 4),
                new com.annyshik.Point(4, 3),
                new com.annyshik.Point(0, 0)
        };
        /*** вывод сообщения лежит ли точка в начале координат*/
        for (com.annyshik.Point point : allPoints) {
            point.corToConsole();
            System.out.println("Point at the origin: " + point.pointAtTheOrigin());
        }
        double distanceBetweenPoints = allPoints[0].lengthToDot(allPoints[1]);
        /***вывод сообщения расстояния до другой точки*/
        System.out.println("Distance between points №1 and №2 = " + distanceBetweenPoints);
        //где находится центр круга
        com.annyshik.Point centerCircle = new com.annyshik.Point(0, 0);
        //и указание радиуса
        com.annyshik.Circle circle = new com.annyshik.Circle(centerCircle, 5);
        System.out.println("Сenter of circle: ");
        centerCircle.corToConsole();
        System.out.println("Radius of circle: " + circle.getRadius());
        /***вывод сообщения лежит ли точки в этой окружности*/
        System.out.println("Point №1 in the circle: " + circle.containsPoint(allPoints[0]));
        System.out.println("Point №2 in the circle: " + circle.containsPoint(allPoints[1]));

    }

    public static void main(String[] args) {
        // task1();
        task2();


    }
}

