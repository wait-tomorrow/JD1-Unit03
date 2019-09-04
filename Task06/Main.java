package by.htp.SimpleClass.Task06;

/*
 * 6. Составьте описание класса для представления времени. 
 * Предусмотрите возможности установки времени и изменения его отдельных 
 * полей (час, минута, секунда) с проверкой допустимости вводимых значений. 
 * В случае недопустимых значений полей поле устанавливается в значение 0. 
 * Создать методы изменения времени на заданное количество часов, минут и секунд. 
 * */

public class Main {

    public static void main(String[] args) {
	SimpleTime t = new SimpleTime(23, 40, 50);
	SimpleTimeLogic tl = new SimpleTimeLogic();

	tl.addTime(t, 1, 5, 5);
	System.out.println(t.getTime());
    }
}
