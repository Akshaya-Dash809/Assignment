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
		System.out.println("College :" +this.college+ "Designation : "+this.designation);
	}
	
 }
class ItTeacher extends Teacher{
	
}
class MathTeacher extends Teacher{
	
}
class MusicTeacher extends Teacher{
	
}
class PhysicsTeacher extends Teacher{
	
}

public class TeacherMain {
	
	public static void main(String[] args) {
		ItTeacher it = new ItTeacher(); 
	    it.work();
		MathTeacher mt =new MathTeacher();
		mt.work();
		MusicTeacher muc=new MusicTeacher();
		muc.work();
		PhysicsTeacher pt = new PhysicsTeacher();
		pt.work();
	}
}
	
