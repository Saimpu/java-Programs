//Static Nested Class
class Outer{
	static int data=30;
	static class Nested{
		void display(){
			System.out.println("Data is: " +data);
		}
	}
}
public class Static{
        public static void main(String[] args){
        
        	Outer.Nested obj=new Outer.Nested();
        	
        	obj.display();
        }
}
