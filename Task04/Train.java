package by.htp.SimpleClass.Task04;

import java.util.Calendar;

public class Train {

    private String destination;
    private int id;
    private Calendar departureTime;

    public Train(String destination, int id, Calendar departureTime) {
	this.id = id;
	this.departureTime = departureTime;
	this.destination = destination;
    }

    public String getDestination() {
	return this.destination;
    }

    public void setDestination(String destination) {
	this.destination = destination;
    }

    public int getId() {
	return this.id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public Calendar getDepartureTime() {
	return this.departureTime;
    }

    public void setDepartureTime(Calendar departureTime) {
	this.departureTime = departureTime;
    }
}
