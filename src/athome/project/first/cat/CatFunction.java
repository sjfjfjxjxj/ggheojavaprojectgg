package athome.project.first.cat;

import java.util.Scanner;

public class CatFunction {
    CatInfo [] catinfos; //����̵� �������� �����ϰԲ� �迭 ����
    
    public CatFunction() {
        catinfos = new CatInfo[2]; //�θ����� ����غ���^_T
    }
    
    public int printMenu() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("-----����� �Ϸ�ġ ��� �� ����ϱ�-----");
    	System.out.println("1. ����� ���� �Է�");
        System.out.println("2. ����� ���� ���");
        System.out.println("3. Į�θ� ��� �� ��� �� ���");
        System.out.println("4. ���α׷� ����");
        System.out.println("�޴� �Է� : ");
        int menu = sc.nextInt();
        return menu;
    }
    
    public void inputCat() {
    	Scanner sc = new Scanner(System.in);
    	for(int i = 0; i<catinfos.length; i++) {
    		System.out.println("-----" + (i+1) + "��° ����� ���� �Է�-----");
    		System.out.println("����� �̸�: ");
    		String name = sc.next();
    		System.out.println("����� ü��(kg): ");
    		double weight = sc.nextInt();
    		System.out.println("����� ����(1���̸�:0 / 1���̻�:1 / 11���̻�:2) : ");
    		int age = sc.nextInt();
    		System.out.println("����� �߼�ȭ ����(y/n): ");
    		char neutral = sc.next().charAt(0);
    		catinfos[i] = new CatInfo(); //����� �������� ��������
    		catinfos[i].setName(name);
    		catinfos[i].setWeight(weight);
    		catinfos[i].setAge(age);
    		catinfos[i].setNeutral(neutral);   				
    	}
    }
    
    public void printCat() {
    	for(int i = 0; i<catinfos.length; i++) {
    		System.out.println("-----" + (i+1) + "��° ����� ���� ���-----");
    		System.out.println("�ֱ� " + catinfos[i].getName() + "�� ����");
    		System.out.println("ü��: " + catinfos[i].getWeight() );
    		System.out.println("����: " + catinfos[i].getAge() ); //���� ��¼��
    		System.out.println("�߼�ȭ ����: " + catinfos[i].getNeutral() );
    	}
    }
    
    public void printKcal() {
    	for(int i = 0; i < catinfos.length; i++) {
    		int active = 0;
    		if(catinfos[i].getAge() == 0) {�Ʊ�����. 2.5�� Ȱ�����}
    		else if(catinfos[i].getAge()>=11) {��ɹ�. 1.2�� }
    		else {�߼�ȭ���� 1.2, ���߼�ȭ 1.4} //1~10��
    		
    		System.out.println("-----" + (i+1) + "��° ������� �Ϸ� �ʿ� Į�θ�-----");
    		System.out.println(catinfos[i].getName()+"�� �Ϸ翡 "+((30*catinfos[i].getWeight()+70)*Ȱ�������)  + "kcal �� �ʿ��ؿ�.");
    	}
    }
    
    public void printExit() {}
    
}
//----------����� �Ϸ�ġ ��� �� ����ϱ�-----------
//0. �޴� printMenu
//1. ����� ���� �Է� inputCat
//2. ����� ���� ��� printCat
//3. ����� �ʿ� Į�θ� ��� -> ��� �� ��� printKcal 
//3. ���α׷� ���� printExit
//-----------------------------------------------------