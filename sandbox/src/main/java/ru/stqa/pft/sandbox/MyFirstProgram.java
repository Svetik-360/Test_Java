package ru.stqa.pft.sandbox;

public class MyFirstProgram {
  public static void main(String[] args){

    Square s = new Square(5);
    System.out.println("S1 - " + s.l + " = " + s.area());//Площадь квадрата со стороной

    Rectangle r = new Rectangle(4,6);
    System.out.println("S2 - " + r.a + " & " + r.b + " = " + r.area());//Площадь квадрата со сторонами
  }

  public static void hello(String somebody) {
    System.out.println(somebody); //sout
  }
}



//  public static double area(Square s) {// Функция, убрали в Метод класса Square
//    return s.l * s.l;
//  }

//  public static double area(Rectangle r) {// Функция, убрали в Метод класса Rectangle
//    return r.a * r.b;
//  }
