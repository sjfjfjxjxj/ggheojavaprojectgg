package home.home.noupdate;

public class Ex_DimArray4 {
    public static void main(String[] args) {
        //  1   6   11   16   21
        //  2   7   12   17   22
        //  3   8   13   18   23
        //  4   9   14   19   24
        //  5  10   15   20   25
    	int k = 1;
    	int [][] arrs = new int[5][5];
    	for(int i = 0; i < arrs.length; i++) {
    		for(int j = 0; j < arrs[0].length; j++) {
    			arrs[j][i] = k;
    			k++;
    		}
    	}
    	for(int i = 0; i < arrs.length; i++) {
    		for(int j = 0; j < arrs[i].length; j++) {
    			System.out.printf("%3d", arrs[i][j]);
    		}
    		System.out.println();
    	}
    }
}
