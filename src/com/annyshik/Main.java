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

class  Point{ //класс точка (математическая, двухмерная)
    public int corX;
    public int corY;
    public int radius;
//конструктор принимает координаты
    public Point (int corX, int corY,int radius) {
        this.corX = corX;
        this.corY = corY;
        this.radius = radius;
    }

    private double center;

    /***метод проверки лежит ли точка в начале координат (возвращает true или false)
     *
     */
//      public boolean pointAtTheOrigin (Point dot){
//        boolean itPointOrigin = dot.lengthTo(center) <= radius;
//        return itPointOrigin;
//}

}
class Circle { //класс окружность

    public int centerCircle;
    public double radius;
    //конструктор принимает точку-центр и радиус

    public Circle (Point centerCircle, double radiusCircle)     {
        this.radius = radius;
    }
    /*** метод проверки лежит ли точка в этой окружности
    //Нахождение длины отрезка между точкой lengthToDot и началом координат по теореме Пифагора
    // (квадрат длины гипотенузы равен сумме квадратов длин катетов).
    //Сравнению полученного значения с радиусом круга.
    */
    public double lengthToDot =
          public boolean containsPoint (Point p){
        boolean itPointInCercle = p.lengthToDot(center) <= radius;
        return itPointInCercle;
}
}

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Бобик");

        Paw givePaw = new Paw("подал лапу");
        Voice castVoice = new Voice("Гав!");

        System.out.println(dog.name + " " + givePaw.paw);
        System.out.println(castVoice.sayVoice);
        //////////////////
        Point point = new Point ();

    }
}
