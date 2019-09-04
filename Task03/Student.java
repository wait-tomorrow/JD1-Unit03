package by.htp.SimpleClass.Task03;

public class Student {
    private String fio;
    private int[] mark;

    public Student(String fio, int[] mark) {
	this.fio = fio;
	this.mark = mark;
    }

    public String getFio() {
	return this.fio;
    }

    public void setFio(String fio) {
	this.fio = fio;
    }

    public int[] getMark() {
	return this.mark;
    }

    public void setMark(int[] mark) {
	this.mark = mark;
    }
}
