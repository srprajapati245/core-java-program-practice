interface Drawable{
	void draw();  
	
	default void msg(){
		System.out.println("default method Drawable interface");
	} 

	default void msg2(){
		System.out.println("default method Drawable interface 2");
	} 	
}