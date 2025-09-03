// TO GET THGE STUDENT DETAILS USING ACCESS SPECIFIER AND RETURNTYPE
class Student{
	String firstName;
	String LastName;
	String regId;
	int score;
	//assigning the values into the variables
	public void setDetails( String fn,String ln,String rI, int s ){
		firstName=fn;
		LastName=ln;
		regId=rI;
		 score=s;
	}
	//by this we get output
	public void getDetails(){
		System.out.println("firstname: "+firstName);
		System.out.println("lastname: "+LastName);
		System.out.println("regId: "+regId);
		System.out.println("score: "+score);
	}
}
//testing the above class
public class StudentDemo{
	public static void main(String args[]){
		Student s=new Student();
		s.setDetails("saimpu","karthik","24pa1a05k3",100);
		s.getDetails();
	}
}
