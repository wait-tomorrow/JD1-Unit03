package by.htp.SimpleClass.Task01;

/*
 * 1. Создайте класс Test1 двумя переменными. 
 * Добавьте метод вывода на экран и методы изменения этих переменных. 
 * Добавьте метод, который находит сумму значений этих переменных, 
 * и метод, который находит наибольшее значение из этих двух переменных. 
 * */

public class Task01 {

    public static void main(String[] args) {
	Test1 testClass = new Test1(3, 5);

	testClass.print();

	System.out.println("Сумма переменных: " + testClass.sum());
	System.out.println("Наибольшая переменная: " + testClass.compare());

	System.out.println("====");
	testClass.setB(10);
	testClass.print();

	System.out.println("Сумма переменных: " + testClass.sum());
	System.out.println("Наибольшая переменная: " + testClass.compare());
    }
}
