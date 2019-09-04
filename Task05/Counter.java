package by.htp.SimpleClass.Task05;

public class Counter {
    private int value;
    private int maxValue;
    private int minValue;

    public Counter(int value, int minValue, int maxValue) {
	this.maxValue = maxValue;
	this.minValue = minValue;
	this.value = value;
    }

    public Counter() {
	this.value = 0;
	this.minValue = 0;
	this.maxValue = 10;
    }

    public void setValue(int value) {
	this.value = value;
    }

    public int getValue() {
	return this.value;
    }

    public void setMaxValue(int maxValue) {
	this.maxValue = maxValue;
    }

    public int getMaxValue() {
	return this.maxValue;
    }

    public void setMinValue(int minValue) {
	this.minValue = minValue;
    }

    public int getMinValue() {
	return this.minValue;
    }

    public void increaseValueByOne() {
	if (isAvailableValue(value + 1)) {
	    value++;
	}
    }

    public void decreaseValueByOne() {
	if (isAvailableValue(value - 1)) {
	    value--;
	}
    }

    private boolean isAvailableValue(int checkingValue) {
	if (checkingValue >= minValue && checkingValue <= maxValue) {
	    return true;
	}

	return false;
    }

    public void increaseValue(int x) {
	if (isAvailableValue(value + x)) {
	    value = value + x;
	}
    }

    public void decreaseValue(int x) {
	if (isAvailableValue(value - x)) {
	    value = value - x;
	}
    }
}
