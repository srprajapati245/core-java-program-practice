public class TestInterfaceDefault implements Drawable, Printable{
	public void draw() {
		System.out.println("Drawing");
	}
	public void print() {
		System.out.println("Printting");
	}
	
	public static void main(String[] args){
		TestInterfaceDefault testInterfaceDefault = new TestInterfaceDefault();
		testInterfaceDefault.draw();
		testInterfaceDefault.print();
		testInterfaceDefault.msg();
		testInterfaceDefault.msg2();
		/* Printable.hello();
		Printable.bye(); */
	}
	
}