//Example of Multilevel Inheritance

package Lab_11Oct;

	public class Main1{
		public static void main(String[] args) {
			// TODO Auto-generated constructor stub
			//GrandFather g = new GrandFather();
			//Father f= new Father();
			Child c= new Child();
			//Due to it is a MultiLevel Inheritance,no need to create parent class object
			c.sleep();
			c.eat();
			c.play();
		}
	}

