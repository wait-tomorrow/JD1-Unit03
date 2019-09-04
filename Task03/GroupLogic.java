package by.htp.SimpleClass.Task03;

public class GroupLogic {

    public void formGroup(Group group) {
	Student students[] = { new Student("Иванов", new int[] { 9, 6, 9, 9, 10 }),
		new Student("Петрофф", new int[] { 9, 10, 10, 9, 10 }),
		new Student("Сидоров", new int[] { 9, 9, 7, 9, 10 }),
		new Student("Ильиченко", new int[] { 9, 9, 9, 9, 10 }),
		new Student("Панфилова", new int[] { 9, 5, 9, 9, 10 }),
		new Student("Кассимова", new int[] { 9, 9, 8, 9, 10 }),
		new Student("Чигунов", new int[] { 9, 5, 9, 4, 10 }),
		new Student("Лепёшкина", new int[] { 9, 9, 9, 9, 10 }),
		new Student("Машталлер", new int[] { 9, 9, 9, 9, 10 }),
		new Student("Райзих", new int[] { 9, 9, 9, 9, 10 }), };

	group.setStudents(students);
    }

    public Student[] getPerfectStudents(Group group) {
	Student[] students = group.getSudents();
	int countPerfectStudent = calculatePerfectStudents(students);
	Student[] perfectStudents = new Student[countPerfectStudent];
	StudentLogic sl = new StudentLogic();

	int lastIndex = 0;
	for (Student student : students) {
	    if (sl.isPerfectStudent(student)) {
		perfectStudents[lastIndex] = student;
		lastIndex++;
	    }
	}

	return perfectStudents;
    }

    private int calculatePerfectStudents(Student[] students) {
	StudentLogic sl = new StudentLogic();

	int count = 0;
	for (Student student : students) {
	    if (sl.isPerfectStudent(student)) {
		count++;
	    }
	}

	return count;
    }
}
