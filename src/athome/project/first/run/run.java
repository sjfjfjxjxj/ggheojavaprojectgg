package athome.project.first.run;

import athome.project.first.cat.CatFunction;

public class run {
    public static void main(String [] args) {
    	CatFunction sCatf = new CatFunction();
    	EXIT:
    	while(true) {
    		int choice = sCatf.printMenu();
    		switch(choice) {
    		    case 1 : 
    		    	sCatf.inputCat();
    		    	break; 
    		    case 2 : 
    		    	sCatf.printCat();
    		    	break;
    		    case 3 : break;
    		    case 4 : break EXIT;
    		    default : break;
    		}
    		
    		
    		
    	}
    }
}


//----------고양이 하루치 사료 양 계산하기-----------
//0. 메뉴 printMenu
//1. 고양이 정보 입력 inputCat
//2. 고양이 정보 출력 printCat
//3. 고양이 필요 칼로리 출력 -> 사료 양 계산 printKcal 
//3. 프로그램 종료 printExit
//-----------------------------------------------------