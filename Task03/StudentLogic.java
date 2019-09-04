package by.htp.SimpleClass.Task03;

public class StudentLogic {

    public boolean isPerfectStudent(Student student) {
	int[] mark = student.getMark();
	for (int i = 0; i < mark.length; i++) {
	    if (mark[i] < 9) {
		return false;
	    }
	}
	return true;
    }
}
