class postPreFix{
	public static void main(String args[]){
		int a = 5;
		int b = 10;
		int x = ++a + b--;
		System.out.printf("a = %1$d, b = %2$d, x = %3$d", a,b,x);
	}
}