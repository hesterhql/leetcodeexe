package test1;

public class Demo01 extends MethodOveride {
	int number1;

	// Overriding method
	public void disp() {
		super.disp();
		System.out.println("disp() method of Child class");
	}

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int n1) {
		this.number1 = n1;
	}

	public void newMethod() {
		super.newMethod();
		System.out.println("new method of child class");
	}

	public static void main(String args[]) {
		/*
		 * When Parent class reference refers to the parent class object then in this
		 * case overridden method (the method of parent class) is called.
		 */
		MethodOveride obj = new MethodOveride();
		obj.disp();

		/*
		 * When parent class reference refers to the child class object then the
		 * overriding method (method of child class) is called. This is called dynamic
		 * method dispatch and runtime polymorphism
		 */
		MethodOveride obj2 = new Demo01();
		obj2.disp();
		obj2.newMethod();
	}
}
