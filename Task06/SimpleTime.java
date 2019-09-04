package by.htp.SimpleClass.Task06;

public class SimpleTime {
    private int hour;
    private int minute;
    private int second;

    public SimpleTime(int hour, int minute, int second) {
	if (hour < 0 || hour > 23) {
	    hour = 0;
	}

	if (minute < 0 || minute > 59) {
	    minute = 0;
	}

	if (second < 0 || second > 59) {
	    second = 0;
	}

	this.hour = hour;
	this.minute = minute;
	this.second = second;
    }

    public void setHour(int hour) {
	if (hour < 0 || hour > 23) {
	    hour = 0;
	}
	this.hour = hour;
    }

    public int getHour() {
	return this.hour;
    }

    public void setMinute(int minute) {
	if (minute < 0 || minute > 59) {
	    minute = 0;
	}
	this.minute = minute;
    }

    public int getMinute() {
	return this.minute;
    }

    public void setSecond(int second) {
	if (second < 0 || second > 59) {
	    second = 0;
	}
	this.second = second;
    }

    public int getSecond() {
	return this.second;
    }

    public String getTime() {
	return this.getHour() + ":" + this.getMinute() + ":" + this.getSecond();
    }
}
