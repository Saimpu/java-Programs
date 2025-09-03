class Rectangle
{
	double width;
	double height;
	public Rectangle()
	{
		height=0.0;
		width=0.0;
	}
	public Rectangle( double w,double h){
		height=h;
		width=w;
	}
	public double getArea()
	{
		return height*width;
	}
	public double getPerimeter()
	{
		return 2*(height+width);
	}
}
public class RectangleDemo
{
	public static void main(String args[]){
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle(10,20);
		System.out.println("rectangle 1 Details: " +r1.getArea()+r1.getPerimeter());
		System.out.println("rectangle 1 Details: " +r2.getArea()+r2.getPerimeter());
	}
}
