package com.kh.day14.listcollection;
//�� ����ƴ�

public class Run {
	public static void main(String[] args) {
        ObjectList objList = new ObjectList();
        objList.add(11);
        objList.add("��");
//        objList.add(8888);
//        objList.add("���׶���");
        Student std = new Student();
//        objList.add(std);
        int num = (int)objList.get(0);
        String str = (String)objList.get(1);
        Student sOne = (Student)objList.get(2);
        //�پ��� �ڷ����� ����� �� ������
        //������ ������ �ٿ�ĳ����(����ȯ)
        //���־�� �Ѵ�!
        
	}
	public void intExample(){
		//int [] nums = new int[3];
		IntList nums = new IntList();//�ε��� �Ű� �Ⱦ��� �ְ������ �־��ٰž�
//		nums[0] = 1;
		nums.add(1);//1�̶�� ���� �����Ѵ�(�ε����ƴ�)
//		nums[1] = 2;
		nums.add(2);
//		nums[2] = 3;
		nums.add(3);
		//java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		//nums[3] = 4;
		nums.add(4);
		System.out.println("1��°��: " + nums.get(0));
		System.out.println("2��°��: " + nums.get(1));
		System.out.println("3��°��: " + nums.get(2));//get�ȿ��ִ¾� �ε���
		System.out.println("3��°��: " + nums.get(3));
		System.out.println("ũ��: " + nums.size());
		
		//�� ���� �迭�� �Ҷ�
		//nums[0] = nums[1] = nums[2] = 0;
		nums.clear();
		System.out.println("���� �� ũ��: " + nums.size());
}
}
