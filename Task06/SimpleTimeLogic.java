package by.htp.SimpleClass.Task06;

public class SimpleTimeLogic {

    public SimpleTime createTimeObject(int hour, int minute, int second) {
	// check

	return new SimpleTime(hour, minute, second);
    }

    public void addTime(SimpleTime t, int hours, int minute, int second) {
	if (hours > 23 || hours < 0 || minute > 59 || minute < 0 || second > 59 || second < 0) {
	    return;
	}

	int s = t.getSecond() + second;
	int m = t.getMinute() + minute;
	int h = t.getHour() + hours;

	if (s >= 60) {
	    t.setSecond(s - 60);
	    m++;
	} else {
	    t.setSecond(s);
	}

	if (m >= 60) {
	    t.setMinute(m - 60);
	    h++;
	} else {
	    t.setMinute(m);
	}

	if (h > 23) {
	    t.setHour(h - 24);
	} else {
	    t.setHour(h);
	}
    }
}
