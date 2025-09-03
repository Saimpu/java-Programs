//Member Inner Class
class Outer{
	static int data=30;
	class Inner{
		void display(){
			System.out.println("Data is: " +data);
		}
	}
}
public class MemberInner{
        public static void main(String[] args){
        	Outer obj=new Outer();
        	Outer.Inner obj1=obj.new Inner();
        	obj1.display();
        }
}
