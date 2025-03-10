package Geometry;

public class Geometry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point al = new Point(5,10);
		Point kar = new Point(7,6);
		
		double d;
		d=al.distance(kar);
		System.out.println(d);
		
		boolean ans;
		ans=al.isOrigin();
		System.out.println(ans);
		
		ans=al.isEqual(kar);
		System.out.println(ans);
		
		al.print();
		
		System.out.println(al);
		
		kar.toString();

		System.out.println("---------------");
		
		Circle c1 = new Circle(4,al);
		Circle c2 = new Circle(2,kar);
		
		Circle c3 = new Circle(2,al);
		Circle c4 = new Circle(3,kar);
		
		c1.print();
		
		ans=c1.equals(c2);
		System.out.println(ans);
		
		ans=c1.isConcentric(c2);
		System.out.println(ans);
		
		ans=c3.isIntersect(c4);
		System.out.println(ans);
		
		ans=c3.isEqual(c4);
		System.out.println(ans);
		
		d=c1.area();
		System.out.println(d);
		
		d=c4.perimeter();
		System.out.println(d);
		
		System.out.println("----------");
		
		Point a = new Point(4,5);
		Point b = new Point(8,8);
		
		Rectangle rec1 = new Rectangle(5,2,a);
		Rectangle rec2 = new Rectangle(6,3,b);
		
		double rectangleArea;
		rectangleArea=rec1.area();
		System.out.println(rectangleArea);
		
		double rectanglePerimeter;
		rectanglePerimeter=rec2.perimeter();
		System.out.println(rectanglePerimeter);
		
		rec1.print();
		
		int rectangleCompare;
		rectangleCompare = rec1.compareTo(rec2);
		System.out.println(rectangleCompare);
		
		boolean equalRectangle;
		equalRectangle=rec1.isEqual(rec2);
		System.out.println(equalRectangle);
	}

}
