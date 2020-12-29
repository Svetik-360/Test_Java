package ru.stqa.pft.sandbox;

//Square - это класс, который описывает структуру объектов, хранящих информацию о квадратах

public class Square {

  public double l;

  public Square(double l) { // Конструктор
    this.l = l; //  this.l - атрибут, len - переменная, которая объявлена, как оргумент функции -  заменяем ее на l, l в this не считается
  }
  public  double area() {// Метод
    return this.l * this.l;
  }
}
