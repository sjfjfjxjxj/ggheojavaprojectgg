package com.kh.day14.listcollection;
//아 졸어렵다

public class Run {
	public static void main(String[] args) {
        ObjectList objList = new ObjectList();
        objList.add(11);
        objList.add("월");
//        objList.add(8888);
//        objList.add("오잉또잉");
        Student std = new Student();
//        objList.add(std);
        int num = (int)objList.get(0);
        String str = (String)objList.get(1);
        Student sOne = (Student)objList.get(2);
        //다양한 자료형을 사용할 수 있으며
        //꺼내서 쓸때는 다운캐스팅(형변환)
        //해주어야 한다!
        
	}
	public void intExample(){
		//int [] nums = new int[3];
		IntList nums = new IntList();//인덱스 신경 안쓰고 넣고싶은값 넣어줄거야
//		nums[0] = 1;
		nums.add(1);//1이라는 값을 저장한다(인덱스아님)
//		nums[1] = 2;
		nums.add(2);
//		nums[2] = 3;
		nums.add(3);
		//java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		//nums[3] = 4;
		nums.add(4);
		System.out.println("1번째값: " + nums.get(0));
		System.out.println("2번째값: " + nums.get(1));
		System.out.println("3번째값: " + nums.get(2));//get안에있는앤 인덱스
		System.out.println("3번째값: " + nums.get(3));
		System.out.println("크기: " + nums.size());
		
		//값 삭제 배열로 할땐
		//nums[0] = nums[1] = nums[2] = 0;
		nums.clear();
		System.out.println("삭제 후 크기: " + nums.size());
}
}
