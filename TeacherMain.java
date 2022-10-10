/*
 * problem 1:
In this example, you have a base class Teacher and a 
sub class ITTeacher. Since class ITTeacher extends the designation
and college properties and work () method from base class,
we need not to declare these properties and method in sub class.
Here we have college Name, designation and work () method 
which are common to all the teachers so we have 
declared them in the base class,this way the child classes 
like Math Teacher, Music Teacher and PhysicsTeacher 
do not need to write this code and can be used directly from base class.
 */

 package lab_10Oct;
 class Teacher {
    String college="PJCMT";
	String designation="Teacher";
	public void work() {
		
	}
	void display() {
		System.out.println("Designation: " +designation+ " College: " +college );
	}
 }
class ItTeacher extends Teacher{
	public void work() {
		System.out.println("Teach It ");
	}
}
class MathTeacher extends Teacher{
	public void work() {
		System.out.println("Teach Math ");
	}
}
class MusicTeacher extends Teacher{
	public void work() {
		System.out.println("Teach Music ");
	}
}
class PhysicsTeacher extends Teacher{
	public void work() {
		System.out.println("Teach Physics");
	}
}

public class TeacherMain {
	
	public static void main(String[] args) {
		ItTeacher it = new ItTeacher(); 
	    it.display();
	    it.work();
		MathTeacher mt =new MathTeacher();
		mt.display();
		mt.work();
		MusicTeacher muc=new MusicTeacher();
		muc.display();
		muc.work();
		PhysicsTeacher pt = new PhysicsTeacher();
		pt.display();
		pt.work();
	}
	

}