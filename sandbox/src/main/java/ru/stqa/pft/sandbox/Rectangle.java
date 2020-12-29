package ru.stqa.pft.sandbox;

public class Rectangle { //Прямоугольник
  public double a;
  public double b;

  public Rectangle(double a, double b){ // Конструктор
    this.a = a;
    this.b = b;
  }
  public double area() {//  Метод
    return this.a * this.b;
  }
}
