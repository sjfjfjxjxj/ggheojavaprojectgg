package com.kh.day06.exercise;

public class Exercise_DimArray {
	public void exercise1() {
		// 5 4 3 2 1 �ަU���� ���������� ���� k���� �ǵ������
		// 10 9 8 7 6 �׷��� �����ʿ��� �������� ����,
		// 15 14 13 12 11
		// 20 19 18 17 16
		// 25 24 23 22 21
		int k = 1;
		int[][] arrs = new int[5][5];
		for (int i = 0; i < arrs.length; i++) { // ����ä���
			for (int j = arrs.length - 1; j >= 0; j--) { // �����U���� �������� ���Բ� : ����ä���
				arrs[i][j] = k;
				k++; // ���� ����! ---->��� �غ� ��
			}
		} // ���⼭���� ���
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d", arrs[i][j]);
			}
			System.out.println();
		}
	}

	public void exercise2() {
		// 5 10 15 20 25 [04] [14] [24] [34] [44] �̰͵� �ؿ��� ����
		// 4 9 14 19 24 [03] [13] [23] [33] [43]
		// 3 8 13 18 23 [02] [12] [22] [32] [42]
		// 2 7 12 17 22 [01] [11] [21] [31] [41]
		// 1 6 11 16 21 [00] [10] [20] [30] [40]
		int k = 1;
		int[][] arrs = new int[5][5];
		for (int i = 0; i < arrs.length; i++) {
			for (int j = arrs.length - 1; j >= 0; j--) {
				arrs[j][i] = k; // �˾Ҵ�!�̤�
				k++;
			}
		}
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%3d", arrs[i][j]);
			}
			System.out.println();
		}
	}

	public void exercise3() {
     //  1   6   11   16   21
     //  2   7   12   17   22
     //  3   8   13   18   23
     //  4   9   14   19   24
     //  5  10   15   20   25
    	int [][] arrs = new int[5][5];
    	int k = 1;
    	for(int i = 0; i < arrs.length; i++) {
    		for(int e = 0; e < arrs[i].length; e++) {
    			arrs[e][i] = k; //�� ���θ� ���� �ǵ帮������� �� i e�� �ٲٸ� �Ǵ°ſ���̤�!��Ű��Ű
    			k++;
    		}
    	}
    	for(int i = 0; i < arrs.length; i++) {
    		for(int e = 0; e < arrs[i].length; e++) {
    			System.out.printf("%2d", arrs[i][e]);
    		}
    		System.out.println();
    	}
    }

	public void exercise4() {
        //  1    2    3    4    5
    	// 10    9    8    7    6
    	// 11   12   13   14   15
    	// 20   19   18   17   16
    	// 21   22   23   24   25
    	int k = 1;
    	int [][] arrs = new int[5][5];
    	for(int i = 0; i < arrs.length; i++) {
    		if(i % 2 == 0) {
    			for(int e = 0; e < arrs[i].length; e++) {
    				arrs[i][e] = k;
    				k++;
    			}
    		}
    		 else {
    			for(int e = arrs.length-1; e >=0; e--) {
    				arrs[i][e] = k;
    				k++;
    			}
    		}
    	}
    		for(int i = 0; i < arrs.length; i++) {
    			for(int e = 0; e < arrs.length; e++) {
    				System.out.printf("%2d", arrs[i][e]);
    			}
    		    System.out.println();	
    		}
    		}

	public void exercise5() {
		// 2���� �迭�� �г⺰�� 1,2�б� �������� �����ϰ�
		// 4�Ⱓ ��ü ���� ����� ����϶�.
        // double [][] score = {{3.3, 3.4},{3.5, 3.6},{3.7, 4.0},{4.1, 4.2}};
        double [][] score = {{3.3, 3.4}, {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};
        double sum = 0;
       // (i�г� 1�б�j����= 00/ 10/ 20/ 30)...�� �ٽ� �����϶�� �Ҹ��� �ƴϱ���;
       // (i�г� 2�б�j����= 01/ 01/ 03/ 04)
	    for(int i = 0; i<score.length; i++) {
	    	for(int e = 0; e<score[i].length; e++) {
	    		sum += score[i][e];
	    	}
	    }
	    int sero = score.length;
	    int garo = score[0].length;
	    System.out.println("4�� ��ü ���� ���: " + sum/(garo*sero));
	
	
	
	
	
	
	}
}
