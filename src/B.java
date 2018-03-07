class B{
	public static void main(String[] args){
		if(void.class.isPrimitive())
			System.out.println("True");
		
		System.out.println(B.class.getName());
		B a = new B();
		B b = a;
		if(a.equals(b))
			System.out.println("True");
		else
			System.out.println("false");
	}
}