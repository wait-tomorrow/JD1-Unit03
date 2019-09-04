package by.htp.SimpleClass.Task04;

import java.io.InputStreamReader;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
 * 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, 
 * время отправления. Создайте данные в массив из пяти элементов типа Train, 
 * добавьте возможность сортировки элементов массива по номерам поездов. 
 * Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
 * Добавьте возможность сортировки массив по пункту назначения, причем поезда с 
 * одинаковыми пунктами назначения должны быть упорядочены по времени отправления. 
 * */

public class Main {

    public static void main(String[] args) {

	Train[] trains = { new Train("Москва", 104, new GregorianCalendar(2019, 9, 1, 12, 05, 0)),
		new Train("Минск", 105, new GregorianCalendar(2019, 9, 1, 12, 30, 0)),
		new Train("Витебск", 965, new GregorianCalendar(2019, 8, 30, 11, 40, 0)),
		new Train("Санкт-Петербург", 565, new GregorianCalendar(2019, 9, 2, 18, 37, 0)),
		new Train("Москва", 398, new GregorianCalendar(2019, 8, 29, 8, 42, 0)) };

	TrainLogic trainLogic = new TrainLogic();
	trainLogic.sortById(trains);
	printTrains(trains);

	System.out.print("\nВведите ID поезда: ");
	Scanner sc = new Scanner(new InputStreamReader(System.in));
	int trainId = sc.nextInt();
	Train selectedTrain = trainLogic.findTrainById(trains, trainId);
	if (selectedTrain != null) {
	    System.out.printf("Информация о поезде с ID %d:\n", trainId);
	    printTrain(selectedTrain);
	} else {
	    System.out.println("Выбранный поезд не обнаружен");
	}

	sc.close();

	System.out.println("\nСортировка по пункту назначения и времени:");
	trainLogic.sortByDestination(trains);
	printTrains(trains);
    }

    public static void printTrains(Train[] trains) {
	for (Train train : trains) {
	    printTrain(train);
	}
    }

    public static void printTrain(Train train) {
	System.out.println(train.getDestination() + " " + train.getId() + " " + train.getDepartureTime().getTime());
    }
}
