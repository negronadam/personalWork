package Inheritance;

public class RectangleTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle(10, 20);
		Parallelogram gram = new Parallelogram(2, 5);
		System.out.println(rectangle.getPerimeter());
		System.out.println(rectangle.area());
		System.out.println(rectangle.toString());
		System.out.println(gram.toString());
		Basketball ball = new Basketball();
		System.out.println(ball.method1());
		System.out.println(ball.method2());
		System.out.println(ball.method3());
		Storage storage = new Storage();
		System.out.println(storage.method2());
	}

}
