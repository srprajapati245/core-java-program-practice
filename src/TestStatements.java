class TestStatements{
	public static void main(String[] args){
		int[][] a = {{1,2}, {3,4}};
		abc:
		for(int[] i: a){
			for(int value: i){
				if(value == 2){
					System.out.println("Breaking with label");
					break abc;
				}	
			}
		}
	}
}