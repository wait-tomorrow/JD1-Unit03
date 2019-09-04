package by.htp.SimpleClass.Task02;

/*
 * 2. Создайте класс Test2 с двумя переменными. 
 * Добавьте конструктор с входными параметрами. 
 * Добавьте конструктор, инициализирующий члены класса по умолчанию. 
 * Добавьте set- и get- методы для полей экземпляра класса.
 * */

public class Task02 {

    public static void main(String[] args) {
	Test2 testClass1 = new Test2();
	System.out.printf("a: %d     b: %d\n", testClass1.getA(), testClass1.getB());

	Test2 testClass2 = new Test2(4, 8);
	System.out.printf("a: %d     b: %d\n", testClass2.getA(), testClass2.getB());
    }
}
