package com.kh.day11.javaapi;
//이상해ㅜㅜ
import java.util.Calendar;

public class Exam_Calendar {
    public static void main(String [] args) {
//		Calendar today = Calendar.getInstance(); // 이렇게하면 호출됐을때 당시의 값을 가져옴
//		int year = today.get(Calendar.YEAR);
//		int month = today.get(Calendar.MONTH) + 1; // 0부터 출력돼서 +1 해주어ㅑ한대
//		int day = today.get(Calendar.DAY_OF_MONTH);
//		int dayOfWeek = today.get(Calendar.DAY_OF_WEEK);// 일월화수목금토(1,2,3,4,5,6,7순)
//		int hour = today.get(Calendar.HOUR);
//		int minute = today.get(Calendar.MINUTE);
//		int second = today.get(Calendar.SECOND);
//
//		System.out.println("년도 : " + year);
//		System.out.println("월 : " + month);
//		System.out.println("일 : " + day);
//		System.out.println("요일 : " + dayOfWeek);
//		System.out.println("시 : " + hour);
//		System.out.println("분 : " + minute);
//		System.out.println("초 : " + second); //매번 쓰기 힘듦으로 모듈화해서 사용
    	
    	Exam_Calendar exCal = new Exam_Calendar();
    	Calendar today = Calendar.getInstance();
    	exCal.printCalendar("현재", today); // 지금시간으로 나옴
    	
    	
    	//개강일 한번 뽑아보기
    	Calendar someDate = Calendar.getInstance();
    	someDate.clear();
    	someDate.set(2022, 10, 23); //월+1
    	someDate.set(Calendar.HOUR_OF_DAY, 9);
    	someDate.set(Calendar.MINUTE,0);
    	exCal.printCalendar("개강일", someDate);
    	
    	//종강일
    	Calendar oneDate = Calendar.getInstance();
    	oneDate.clear();
    	oneDate.set(2023, 4, 2);
    	oneDate.set(Calendar.HOUR_OF_DAY,17);
    	oneDate.set(Calendar.MINUTE,50);
    	exCal.printCalendar("종강일", oneDate);
    	
    	
    }
                              //확장하기 위해 매개변수 사용
    public void printCalendar(String msg, Calendar cal) {
   // 	Calendar today = Calendar.getInstance(); //이렇게하면 호출됐을때 당시의 값을 가져옴
    	int year        = cal.get(Calendar.YEAR);
    	int month       = cal.get(Calendar.MONTH)+1; 
    	int day         = cal.get(Calendar.DAY_OF_MONTH);
    	int dayOfWeek   = cal.get(Calendar.DAY_OF_WEEK);
    	int hour        = cal.get(Calendar.HOUR_OF_DAY); //24시간 표시
    	int hourOfDay   = cal.get(Calendar.HOUR);
    	int ampm        = cal.get(Calendar.AM_PM);
    	int minute      = cal.get(Calendar.MINUTE);
    	int second      = cal.get(Calendar.SECOND);
    	int millisecond = cal.get(Calendar.MILLISECOND);
    	//현재 2022/12/7/수요일(11시) 오전 11시 42분 33초 234밀리초
    	System.out.print(msg+" "+year+"/"+month+"/"+day+"/");
    	switch(dayOfWeek) {
    	    case Calendar.SUNDAY :    System.out.println("일요일"); break; 
    	    case Calendar.MONDAY :    System.out.println("월요일"); break;
    	    case Calendar.TUESDAY :   System.out.println("화요일"); break;
    	    case Calendar.WEDNESDAY : System.out.println("수요일"); break;
    	    case Calendar.THURSDAY :  System.out.println("목요일"); break;
    	    case Calendar.FRIDAY :    System.out.println("금요일"); break;
    	    case Calendar.SATURDAY :  System.out.println("토요일"); break;
    	}
    	System.out.print("(" + hourOfDay + "시)");
    	if(ampm == Calendar.AM)System.out.print("오전");
    	else System.out.print("오후");
    	System.out.print(hour+"시"+minute+"분"+second+"초" + millisecond + "밀리초");
  //  	System.out.println();
    }
}
