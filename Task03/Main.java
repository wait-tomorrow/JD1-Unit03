package by.htp.SimpleClass.Task03;

/*
 * 3. Создайте класс с именем Student, содержащий поля: 
 * фамилия и инициалы, номер группы, успеваемость (массив из 5 элементов). 
 * Создайте массив из 10 элементов такого типа. 
 * Добавьте возможность вывода фамилий и номеров групп студентов, 
 * имеющих оценки, равные только 9 или 10. 
 * */

public class Main {

    public static void main(String[] args) {
	Group group = new Group(42);
	GroupLogic groupLogic = new GroupLogic();

	groupLogic.formGroup(group);

	Student[] students = groupLogic.getPerfectStudents(group);

	System.out.printf("Отличники в группе %d:\n", group.getGroupNumber());
	for (Student student : students) {
	    System.out.println(student.getFio());
	}
    }
}
