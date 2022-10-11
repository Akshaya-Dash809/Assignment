package Lab_11Oct;

	public class GrandFather{ //base class of Father
	void sleep() {
		System.out.println("I am sleeping ");
	}
	}

	class Father extends GrandFather{ //base class of Child and derived class of GrandFather
		void eat() {
			System.out.println("I am eating ");
		}
	}

	class Child extends Father{ //derived class of Father
		void play() {
			System.out.println("I am playing ");
		}
	}
