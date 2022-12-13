package com.kh.day14.exercise;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
//ctrl shift - :���� ȭ���� ������ ����������
import java.util.Scanner;
import java.util.StringTokenizer;

//1. �����Է�(�̸�, ����, �ּ�)
//2. �������
//3. ��������(save)-���Ϸ� ��������(���� ����: �̸�)
//4. �����ҷ�����(load)<-�������� �Է��ؼ� �ε� �Ŀ� 2 �����ϸ� ������µ�
//0. ����
//�޴��Է�: 1
//�׷��ϱ� ���Ͽ� �Ͽ���.txt->�Ͽ���/33/��������α� 
//�ܼ� ����� �̸�: �Ͽ���
//            ����: 33       �䷱������

public class Exercise_IOStream {
	private static String name; //���� ������ �����ϱ����� ��װ� �ʿ���
	private static int age;
	private static String adress;
	
    public static void main(String [] args) {
    	end:
    	while(true) {
    		int choice = printMenu();
    		switch(choice) {
    		case 1 : insert(); break; 
    		case 2 : print(); break; 
    		case 3 : save(); break; 
    		case 4 : load(); break; 
    		case 0 : break end; 
    		default : System.out.println("1~4������ ���ڸ� �Է����ּ���");break; 
    		}
    	}
    	
    	
    }
    
    static int printMenu() { //ctrl+alt+�����Ű = ����!
    	Scanner sc = new Scanner(System.in);
    	System.out.println("1. �����Է�");
    	System.out.println("2. �������");
    	System.out.println("3. ��������(save �� �Է¹��� �̸��� ���ϸ�)");
    	System.out.println("4. �����ҷ�����(load �� 2������ ���) ");
    	System.out.println("0. �����ϱ�");
    	System.out.println("�޴� �Է�: ");
    	int select = sc.nextInt();
    	return select;
    	
    }
    
    
    static void insert() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("�̸� �Է�: ");
    	name = sc.next();
    	System.out.println("���� �Է�: ");
    	age = sc.nextInt();
    	System.out.println("�ּ� �Է�: ");
    	sc.nextLine();//�̰Ÿ� ���������Ѵٰ� �ϵ�?
    	adress = sc.nextLine();
    	
    }
    
    static void print() {
    	System.out.println("======�������======");
    	System.out.println("�̸� : " + name);
    	System.out.println("���� : " + age);
    	System.out.println("�ּ� : " + adress);
    	System.out.println("====================");
    	
    	
    }
    
    static void save() {//��½�Ʈ��(���α׷����� ������file.txt �������°�)
    	Writer os = null;
    	
    	try {
    		String result = name + "/" + age + "/" + adress;
			os = new FileWriter("src/iostream/" + name +".txt");
			os.write(result);
			os.flush();
			System.out.println("����Ϸ�Ǿ����ϴ�");
			System.out.println("====================");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    	
    }
    
    static void load() {
    	Reader reader = null; //�Է½�Ʈ�� ���� ����!
    	BufferedReader bfReader = null; //������ �������� ���۽�Ʈ�� ����. ������� ���پ� �о��
    	Scanner sc = new Scanner(System.in);
    	System.out.println("���ϸ��Է�: ");
    	String fileName = sc.next();
    	String result = "";
    	try {
			reader = new FileReader("src/iostream/" + fileName + ".txt");
			bfReader = new BufferedReader(reader);
			result = bfReader.readLine(); // ���� ���� ������ ����/11/���� �о��->������ �������� �߶����
			// ������ �������� �ڸ��� �ΰ���  1.split() , 2.StringTokenizer�ڸ��� ���ϱ� �˾Ƶα�
			StringTokenizer st = new StringTokenizer(result, "/");
			//�ε��� �Ű� �Ⱦ��� �ؽ�Ʈ��ū�� ����ȴ�(�� ó�� �ؽ�Ʈ��ū�� ù��° ��...)
			name = st.nextToken();
			age = Integer.parseInt(st.nextToken()); //'��Ʈ��'��ũ�������� ��Ʈ�� �о���ϴϱ� ����Ŭ�����Τ���
			adress = st.nextToken();
			System.out.println("�ε尡 �Ϸ�Ǿ����ϴ�");
			System.out.println("���� ��� �Ͻ÷��� 2���� �����ּ���");
			System.out.println("====================");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    }
}







