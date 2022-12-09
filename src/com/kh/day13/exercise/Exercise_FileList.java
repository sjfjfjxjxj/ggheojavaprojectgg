package com.kh.day13.exercise;

import java.io.File;

public class Exercise_FileList {
	                                    //밑에 있는 파일객체가 넘어오면 서브리스트를 출력할 것이다
	public static void listDirectory(File dir) {
		System.out.println("------" + dir.getPath() + "의 서브 리스트입니다. ------");
		File [] subFiles = dir.listFiles();
		for(int i = 0; i < subFiles.length; i++) {
			File fOne = subFiles[i];
			long time = fOne.lastModified();
			System.out.printf("%30s", fOne.getName());//문자열 길이를 30으로 정함
			System.out.print("\t파일 크기 : " + fOne.length());
			System.out.printf("\t수정한시간 : %tb %td %ta %tT\n", time,time,time,time); //tb월 td일 ta요일 tt시간 (printf랑같이쓰는변환문자)
		}
	}
	
    public static void main(String [] args) {
    	File f1 = new File("C:\\windows"); //폴더리스트를 보여주는거니까 폴더로 지정
    	System.out.println(f1.getPath() + "," + f1.getParent() + "," + f1.getName());
    	listDirectory(f1);
    }
}
