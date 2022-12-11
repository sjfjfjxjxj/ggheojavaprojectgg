package com.kh.day11.javaapi;
//�̻��ؤ̤�
import java.util.Calendar;

public class Exam_Calendar {
    public static void main(String [] args) {
//		Calendar today = Calendar.getInstance(); // �̷����ϸ� ȣ������� ����� ���� ������
//		int year = today.get(Calendar.YEAR);
//		int month = today.get(Calendar.MONTH) + 1; // 0���� ��µż� +1 ���־���Ѵ�
//		int day = today.get(Calendar.DAY_OF_MONTH);
//		int dayOfWeek = today.get(Calendar.DAY_OF_WEEK);// �Ͽ�ȭ�������(1,2,3,4,5,6,7��)
//		int hour = today.get(Calendar.HOUR);
//		int minute = today.get(Calendar.MINUTE);
//		int second = today.get(Calendar.SECOND);
//
//		System.out.println("�⵵ : " + year);
//		System.out.println("�� : " + month);
//		System.out.println("�� : " + day);
//		System.out.println("���� : " + dayOfWeek);
//		System.out.println("�� : " + hour);
//		System.out.println("�� : " + minute);
//		System.out.println("�� : " + second); //�Ź� ���� �������� ���ȭ�ؼ� ���
    	
    	Exam_Calendar exCal = new Exam_Calendar();
    	Calendar today = Calendar.getInstance();
    	exCal.printCalendar("����", today); // ���ݽð����� ����
    	
    	
    	//������ �ѹ� �̾ƺ���
    	Calendar someDate = Calendar.getInstance();
    	someDate.clear();
    	someDate.set(2022, 10, 23); //��+1
    	someDate.set(Calendar.HOUR_OF_DAY, 9);
    	someDate.set(Calendar.MINUTE,0);
    	exCal.printCalendar("������", someDate);
    	
    	//������
    	Calendar oneDate = Calendar.getInstance();
    	oneDate.clear();
    	oneDate.set(2023, 4, 2);
    	oneDate.set(Calendar.HOUR_OF_DAY,17);
    	oneDate.set(Calendar.MINUTE,50);
    	exCal.printCalendar("������", oneDate);
    	
    	
    }
                              //Ȯ���ϱ� ���� �Ű����� ���
    public void printCalendar(String msg, Calendar cal) {
   // 	Calendar today = Calendar.getInstance(); //�̷����ϸ� ȣ������� ����� ���� ������
    	int year        = cal.get(Calendar.YEAR);
    	int month       = cal.get(Calendar.MONTH)+1; 
    	int day         = cal.get(Calendar.DAY_OF_MONTH);
    	int dayOfWeek   = cal.get(Calendar.DAY_OF_WEEK);
    	int hour        = cal.get(Calendar.HOUR_OF_DAY); //24�ð� ǥ��
    	int hourOfDay   = cal.get(Calendar.HOUR);
    	int ampm        = cal.get(Calendar.AM_PM);
    	int minute      = cal.get(Calendar.MINUTE);
    	int second      = cal.get(Calendar.SECOND);
    	int millisecond = cal.get(Calendar.MILLISECOND);
    	//���� 2022/12/7/������(11��) ���� 11�� 42�� 33�� 234�и���
    	System.out.print(msg+" "+year+"/"+month+"/"+day+"/");
    	switch(dayOfWeek) {
    	    case Calendar.SUNDAY :    System.out.println("�Ͽ���"); break; 
    	    case Calendar.MONDAY :    System.out.println("������"); break;
    	    case Calendar.TUESDAY :   System.out.println("ȭ����"); break;
    	    case Calendar.WEDNESDAY : System.out.println("������"); break;
    	    case Calendar.THURSDAY :  System.out.println("�����"); break;
    	    case Calendar.FRIDAY :    System.out.println("�ݿ���"); break;
    	    case Calendar.SATURDAY :  System.out.println("�����"); break;
    	}
    	System.out.print("(" + hourOfDay + "��)");
    	if(ampm == Calendar.AM)System.out.print("����");
    	else System.out.print("����");
    	System.out.print(hour+"��"+minute+"��"+second+"��" + millisecond + "�и���");
  //  	System.out.println();
    }
}
