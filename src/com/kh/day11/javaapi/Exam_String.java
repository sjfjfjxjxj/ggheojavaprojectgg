package com.kh.day11.javaapi;
//�̰͵� ���� ���°Ŵϱ� ����ϱ�
public class Exam_String {
    public static void main(String [] args) {
    	String msg = "Hello Java"; //: ���۷������� = ��ü
    	msg = new String("Hello J");
    	
    	String data1 = new String(" C#"); //�տ� ������
    	String data2 = new String(",C++ "); //�ڿ� ������
    	
        System.out.println(data1 + "�� ���̴� " + data1.length()); //3
        System.out.println(data2 + "�� ���̴� " + data2.length());//5->�����ڵ� ���ڼ� ����
        System.out.println("#�� �ִ°�? : " + data1.contains("#")); //true
        
        //���ڿ� ����
        data1 = data1.concat(data2); //C#,C++
        System.out.println("����� ���ڿ� : " + data1);
        
        //��������
    	data1 = data1.trim();
    	System.out.println("���� ���� Ȯ�� : " + data1); //�յڷ� ���� �߸�
    	
    	//C# -> JAVA
    	data1 = data1.replace("C#", "JAVA");
    	System.out.println("���ڿ� ��ü : " + data1);
    	
    	//���ڿ� �и�
    	String [] words = data1.split(",");
    	for(int i = 0; i < words.length; i++) {
    		System.out.println("�и��� ���ڿ� : " + i + ": " + words[i]);
    	}
    	
    	//���ڿ� �ڸ���
    //	data1 = data1.substring(5);
    //	System.out.println("���ڿ� �ڸ��� : " + data1); 
    	data1 = data1.substring(1, 4);
    	System.out.println("������ �ڸ��� : " + data1);
    	
    	char word = data1.charAt(1);
    	System.out.println("���� �ڸ��� : " + word);
    	
    }
    
    
}













