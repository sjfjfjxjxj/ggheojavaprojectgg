package com.kh.day07.run;

import java.util.Scanner;

import com.kh.day07.exercise.Exercise_Lotto;
import com.kh.day07.oop.Person;//oop��� ��Ű�� �ȿ� �ִ°� ���������� ������(default) �����ִ�
import com.kh.day07.oop.Rectangle;

public class run {
    public static void main(String [] args) {
    	Exercise_Lotto exLotto = new Exercise_Lotto(); //new�� ���̸� �޸� �ϳ� �Ҵ��ؼ� �������� �ִ°Ŵ�
    	exLotto.lottoProgram();
    	                    //�������!(�ʵ尪�ʱ�ȭ����)
    //	Person person = new Person();
    //	person.eat();    //��������.���
    //	person.sleep();    //�ּҸ������ϴº���.���
    //	person.speak();  //���۷�������.���
    //	person.walking();  //��ü���۷���.���
    	//person.name = "�Ͽ���";
    //	person.jobName = "�ǻ�";
    	
    	Scanner sc = new Scanner(System.in);
  //��񧷹�۷���(����)��������/�ּҰ� ����Ǵ� ����
    	Rectangle rect = new Rectangle(); //���Ӱ�ü����, �ݵ�� new Ű���� �̿�
    	                                  // new�� ��ü�� ������ ȣ��
    	System.out.print("�ʺ� �Է����ּ��� : ");
    	//��ü�� ��� ����(��� ����: �͸������ �θ���޼ҵ�)
    	//�ν��Ͻ�(Rectangle Ŭ������ ��ü)
    	rect.width = sc.nextInt(); //�ʺ� �޾Ƽ� ����!  //��ü�� ��������� .���� �Ѵ�
    	System.out.print("���̸� �Է����ּ��� : ");
        rect.height = sc.nextInt(); //���� �޾Ƽ� ����!
        //���� ���� ����
      	int result = rect.getArea(); //�ٿ��� ������ �޾Ƽ� ����!
      	//���� �޼ҵ� ����
    	System.out.println("�簢���� ������ : " + result);
    }
}
