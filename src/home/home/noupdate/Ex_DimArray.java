package home.home.noupdate;

public class Ex_DimArray {
    public static void main(String [] args) {
    	int [][] arrs = new int[4][4];
    	int k = 1;
    	System.out.println("��ũ��=��ũ��=����ũ�� : " + arrs.length);
    	System.out.println("��ũ��=��ũ��=����ũ�� : " + arrs[0].length);
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
