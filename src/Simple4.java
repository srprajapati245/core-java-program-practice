class A{
	void printA(){
		System.out.println("Printing Class A");
	}
}

class B{
	void printB(){
		System.out.println("Printing Class B");
	}
}

class C{
	void printC(){
		System.out.println("Printing Class C");
	}
}

class Simple4{
	public static void main(String[] args){
		A a = new A();
		B b = new B();
		C c = new C();
		
		a.printA();
		b.printB();
		c.printC();
	}
}