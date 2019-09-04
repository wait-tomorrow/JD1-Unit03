package by.htp.SimpleClass.Task08;

import java.util.List;

/*8. Создать класс Customer, спецификация которого приведена ниже. 
 * Определить конструкторы, set- и get- методы и метод  toString(). 
 * Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами. 
 * Задать критерии выбора данных и вывести эти данные на консоль.  
 * 
 * Класс Customer: id, фамилия, имя, отчество, 
 * адрес, номер кредитной карточки, номер банковского счета.  
 * 
 * Найти и вывести:  
 * a) список покупателей в алфавитном порядке;  
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 * */

public class Main {

    public static void main(String[] args) {
	CustomerHandler ch = new CustomerHandler();
	ch.addCustomer(
		new Customer(1, "Иванов", "Иван", "г.Москва, где-то там", 1234_5678_9123_4567l, 213146546547894l));
	ch.addCustomer(
		new Customer(2, "Петров", "Петр", "г.Минск, улица хз, дом 49", 8947_5678_9123_4567l, 651465474651475l));
	ch.addCustomer(new Customer(3, "Петров", "Анатолий", "г.Минск, не дом и не улица", 5678_5678_9123_4567l,
		846147411546513l));
	ch.addCustomer(new Customer(4, "Антипенко", "Коляндий", "in the middle of nowhere", 9547_5678_9123_4567l,
		514654741556547l));

	List<Customer> selectedCustomers;
	selectedCustomers = ch.selectCustomersByCreditCardNumber(2000_0000_0000_0000l, 9000_0000_0000_0000l);
	printCustomerArray(selectedCustomers);

	Customer[] sortedCustomers = ch.sortCustomers();
	printCustomerArray(sortedCustomers);
    }

    public static void printCustomerArray(List<Customer> customers) {
	System.out.println("Покупатели с номерами кредитных карт из заданного диапазона: ");
	for (Customer customer : customers) {
	    System.out.println(customer.getShortInfo());
	}
    }

    public static void printCustomerArray(Customer[] customers) {
	System.out.println("Покупатели с номерами кредитных карт из заданного диапазона: ");
	for (Customer customer : customers) {
	    System.out.println(customer.getShortInfo());
	}
    }
}
