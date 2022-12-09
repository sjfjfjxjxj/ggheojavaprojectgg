package com.kh.day13.exercise;

import java.io.File;

public class Exercise_FileList {
	                                    //�ؿ� �ִ� ���ϰ�ü�� �Ѿ���� ���긮��Ʈ�� ����� ���̴�
	public static void listDirectory(File dir) {
		System.out.println("------" + dir.getPath() + "�� ���� ����Ʈ�Դϴ�. ------");
		File [] subFiles = dir.listFiles();
		for(int i = 0; i < subFiles.length; i++) {
			File fOne = subFiles[i];
			long time = fOne.lastModified();
			System.out.printf("%30s", fOne.getName());//���ڿ� ���̸� 30���� ����
			System.out.print("\t���� ũ�� : " + fOne.length());
			System.out.printf("\t�����ѽð� : %tb %td %ta %tT\n", time,time,time,time); //tb�� td�� ta���� tt�ð� (printf�����̾��º�ȯ����)
		}
	}
	
    public static void main(String [] args) {
    	File f1 = new File("C:\\windows"); //��������Ʈ�� �����ִ°Ŵϱ� ������ ����
    	System.out.println(f1.getPath() + "," + f1.getParent() + "," + f1.getName());
    	listDirectory(f1);
    }
}
