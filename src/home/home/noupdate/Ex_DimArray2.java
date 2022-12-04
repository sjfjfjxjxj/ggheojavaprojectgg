package home.home.noupdate;

public class Ex_DimArray2 {
	public static void main(String[] args) {
		// 5 4 3 2 1 왼쪾에서 오른쪽으로 가면 k값을 건드려야해
		// 10 9 8 7 6 그래서 오른쪽에서 왼쪽으로 가고,
		// 15 14 13 12 11
		// 20 19 18 17 16
		// 25 24 23 22 21
		int k = 1;
		int[][] arrs = new int[5][5];
		for (int i = 0; i < arrs.length; i++) {
			for (int j = arrs[i].length-1; j >= 0; j--) {
				arrs[i][j] = k;
				k++;
			}
		}
        for(int i = 0; i < arrs.length; i++) {
        	for(int j = 0; j < arrs[i].length; j++) {
        		System.out.printf("%2d" , arrs[i][j]);
        	}
        	System.out.println();
        }   
	}
}
