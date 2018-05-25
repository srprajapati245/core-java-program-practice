class EscapeSequences {
	public static void main(String[] args) {
		System.out.println("Hello\u0008World!!!"); // \u0008 Backspace
		System.out.println("Hello\u0009World!!!"); // \u0009 Horizontal tab
		System.out.println("Hello\u000cWorld!!!"); // \u000c Form feed (FF)
		System.out.println("Hello\u0027s World!!!"); // \u0027 Apostrophe-quote, also known as double quote
		System.out.println("Hello's World!!!"); // \u0027 Apostrophe-quote, also known as double quote
		System.out.println(\u0022Hello World!!!\u0022); // \u0022 Quotation mark, also known as double quote
		System.out.println("Hello World!!! \u005c\u005c"); // Backslash
		System.out.println("\141"); // \141 (Octal) -> 'a'
		System.out.println("\46"); // \46 (Octal) -> '&'
		System.out.println("\60"); // \60 (Octal) -> '0'
		
	}
}