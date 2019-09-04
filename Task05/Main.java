package by.htp.SimpleClass.Task05;

/*
 * 5. Опишите класс, реализующий десятичный счетчик, 
 * который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне. 
 * Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями. 
 * Счетчик имеет методы увеличения и уменьшения состояния, 
 * и метод позволяющее получить его текущее состояние. 
 * Написать код, демонстрирующий все возможности класса. 
 * */

public class Main {

    public static void main(String[] args) {
	Counter cn = new Counter(5, 0, 10);
	System.out.println("Значение счётчика: " + cn.getValue());

	cn.increaseValueByOne();
	System.out.println("Значение счётчика: " + cn.getValue());

	cn.decreaseValue(4);
	System.out.println("Значение счётчика: " + cn.getValue());
    }

}
