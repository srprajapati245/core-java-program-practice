class TwoDimArray{
	public static void main(String[] args){
		int[][] a = new int[10][5];
		a[2] = a[0];
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				a[i][j] = i + j;
			}
		}
		
		System.out.println(a[0][3]);
	}
}