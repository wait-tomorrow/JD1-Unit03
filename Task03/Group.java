package by.htp.SimpleClass.Task03;

public class Group {

    private Student[] students;
    private int groupNumber;
    
    public Group(int groupNumber){
	this.groupNumber = groupNumber;
    }
    
    public int getGroupNumber() {
	return this.groupNumber;
    }
    
    public void setGroupNumber(int groupNumber) {
	this.groupNumber = groupNumber;
    }
    
    public Student[] getSudents() {
	return students;
    }
    
    public void setStudents(Student[] students) {
	this.students = students;
    }
}
