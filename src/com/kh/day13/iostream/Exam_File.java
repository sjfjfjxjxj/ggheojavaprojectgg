package com.kh.day13.iostream;

import java.io.File;
import java.io.IOException;

public class Exam_File {
    public static void main(String [] args) {
    	File file = new File("D:\\Temp\\omocnuni.png");
    	String fileName = file.getName();
    	String path     = file.getPath();
    	String parent   = file.getParent();
    	
    	System.out.println("파일 이름 : " + fileName);
    	System.out.println("파일 경로 : " + path);
    	System.out.println("부모 폴더 : " +parent);
    	
    	//File fOne = new File("C:\\windows\\system.ini");
    	//System.out.println(fOne.getPath()); //이 경로 있는지 확인하래. 가끔 안읽힐수도있대,,
    	
    	try {
    		File fileMake = new File("src/iostream/fileOne.txt");
			fileMake.createNewFile();//파일을 만들수있다
			File folderMake = new File("src/file");
			folderMake.mkdir();//폴더도 만들수있다
			File fileMake2 = new File("src/file/file.txt");//이렇게 만들면 워크스페이스엔 안보이네
			fileMake2.createNewFile();
			System.out.println("파일이 존재하는가? : " + fileMake.exists());
			System.out.println("fileOne.txt가 파일이 맞는가? : " + fileMake.isFile());
			System.out.println("file폴더가 폴더가 맞는가? : " + folderMake.isDirectory());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
