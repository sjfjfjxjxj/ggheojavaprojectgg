package home.home.noupdate;

public class Ex_DimArray3 {
	public static void main(String[] args) {
		// 5 10 15 20 25 [04] [14] [24] [34] [44] 이것도 밑에서 위로
		// 4 9 14 19 24 [03] [13] [23] [33] [43]
		// 3 8 13 18 23 [02] [12] [22] [32] [42]
		// 2 7 12 17 22 [01] [11] [21] [31] [41]
		// 1 6 11 16 21 [00] [10] [20] [30] [40]
		int k = 1;
		int[][] arrs = new int[5][5];
		for (int i = 0; i < arrs.length; i++) {
			for (int j = arrs.length-1; j >= 0; j--) {
				arrs[j][i] = k;
			    k++; //일단 주소 배치 완료해서 거기다 k값을 넣어
		}
	}
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%3 d", arrs[i][j]);
			} //배치는 끝났으니까 그냥 원래대로 출력하면 된다!
			System.out.println();
		
		
	}
	}
}
