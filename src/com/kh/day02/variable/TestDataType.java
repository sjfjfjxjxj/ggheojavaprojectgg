package com.kh.day02.variable;

public class TestDataType {
  public static void main(String[] args) {
	  //�ڷ��� ������ ���Կ����� ������ ;
	  //1. �ڷ����� ����
	  //�� ���� int
	  byte bNum = 127; //-128~127
	  short sNum = 32767; //-32768~32767
	  int iNum = 2147483647; //-2147483648~2147483647
	  long lNum = 2147483648l; //���̻� l�� �ٿ�����
	  short num = 128; //byte ���� �� ��
	  //�νǼ�
	  float fNum = 22.1123f; //���̻� f�� �ٿ��� ��->�������ϱ� double ���̾�
	  double dNum = 23.502; //��� ���Ҷ� ���� ��
	  //�Ϲ���
	  char fChar = 'A'; //Ȭ����ǥ �ȿ��� 1���� ����
	  String sChar = "Hello Java"; //�ֵ���ǥ �ȿ� n���� ����=���ڿ�
	  //��Boolean��
	  boolean result = false; //1>0, 2<1(�񱳿�����)�� ������� ��Ÿ�������� �ڷ���
	  //�ѹ��ڿ� String�� ������. ���߿�
	  System.out.println("������ �� : "+iNum);
	  System.out.println("������ ��(9999��) : "+lNum);
	  System.out.println("�Ǽ��� �� : "+fNum);
	  System.out.println("�Ǽ��� �� : "+dNum);
	  System.out.println("������ �� : "+fChar);
	  System.out.println("���ڿ��� �� : "+sChar);
	  System.out.println("���� �� : "+result);
	  
	  fChar = 66;
	  System.out.println("���ڿ� ���� : "+fChar);
	  fChar = 75;
	  System.out.println("���ڿ� ���� : "+fChar);
	  //ASKII(�ƽ�Ű)�ڵ�
	  //->����(char)�� ���ڸ� ������ �� �ְ� ASKII�ڵ忡
	  //���εǾ��ִ� ���ڷ� ����� �����ϴ�.
  }
}
