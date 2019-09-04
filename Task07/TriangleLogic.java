package by.htp.SimpleClass.Task07;

public class TriangleLogic {

    public double calculatePerimeter(Triangle t) {
	return t.getA() + t.getB() + t.getC();
    }

    public double calculateArea(Triangle t) {
	double halfP = calculatePerimeter(t) / 2;
	return Math.sqrt(halfP * (halfP - t.getA()) * (halfP - t.getB()) * (halfP - t.getC()));
    }
}
