interface Printable{
	void print();  
	
	static void hello(){
		System.out.println("hello interface");
	}
	
	static void bye(){
		System.out.println("bye interface");
	}
	/* default void msg(){
		System.out.println("default method of Printable interface");
	}  */
}