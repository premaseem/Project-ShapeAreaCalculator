import java.util.Vector;

public class Demo {


	public static void main(String[] args) {
       demoTriangle();
       demoSquare(); 
	}

	private static void demoSquare() {
		Shape square = new Square();
		   Vector<Position> points = square.getPoints();
		   Color red =  new Color(16777215);
		   Position point1 =new Position();
		   point1.setX(1);
		   point1.setY(1);
		   
		   Position point2 =new Position();
		   point2.setX(1);
		   point2.setY(3);
		   
		   Position point3 =new Position();
		   point3.setX(3);
		   point3.setY(1);
		   
		   Position point4 =new Position();
		   point4.setX(3);
		   point4.setY(3);
		   
		   points.add(0,point1);
		   points.add(1,point2);
		   points.add(2,point3);
		   points.add(3,point4);
		   square.setPoints(points);
		   square.setColor(red);
		   square.print();
	}
	
	
	private static void demoTriangle() {
		Shape triangle = new Triangle();
		   Vector<Position> points = triangle.getPoints();
		   Color green =  new Color(16777422);
		   Position point1 =new Position();
		   point1.setX(1);
		   point1.setY(8);
		   
		   Position point2 =new Position();
		   point2.setX(1);
		   point2.setY(16);
		   
		   Position point3 =new Position();
		   point3.setX(10);
		   point3.setY(12);
		   
		   points.add(0,point1);
		   points.add(1,point2);
		   points.add(2,point3);
		   triangle.setPoints(points);
		   triangle.setColor(green);
		   triangle.print();
	}

}
