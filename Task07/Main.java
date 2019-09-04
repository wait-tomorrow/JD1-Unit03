package by.htp.SimpleClass.Task07;

/*
 * 7. Описать класс, представляющий треугольник. 
 * Предусмотреть методы для создания объектов, вычисления площади, 
 * периметра и точки пересечения медиан.
 */

public class Main {

    public static void main(String[] args) {
	Triangle t = new Triangle(3, 4, 5);
	TriangleLogic tl = new TriangleLogic();

	System.out.println("Периметр тругольника: " + tl.calculatePerimeter(t));
	System.out.println("Площадь тругольника: " + tl.calculateArea(t));
    }
}
