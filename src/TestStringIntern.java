class TestStringIntern{
	public static void main(String[] args){
		String s = "Sachin";
		String s1 = new String("Tendulker");
		String s2 = s1.intern();
		System.out.println(s2);
	}
}