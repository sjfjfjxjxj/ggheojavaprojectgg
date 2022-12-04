package home.home.noupdate;

public class Ex_DimArray {
    public static void main(String [] args) {
    	int [][] arrs = new int[4][4];
    	int k = 1;
    	System.out.println("행크기=앞크기=세로크기 : " + arrs.length);
    	System.out.println("열크기=뒷크기=가로크기 : " + arrs[0].length);
    	for(int i = 0; i < arrs.length; i++) {
    		for(int j = 0; j < arrs[i].length; j++) {
    			arrs[i][j] = k;
    			k++;
    		}
    	}
    	for(int i = 0; i < arrs.length; i++) {
    		for(int j = 0; j < arrs.length; j++) {
    			System.out.printf("%2d", arrs[i][j]);
    		}
    		System.out.println();
    	}
    }
}
