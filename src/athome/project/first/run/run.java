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


//----------����� �Ϸ�ġ ��� �� ����ϱ�-----------
//0. �޴� printMenu
//1. ����� ���� �Է� inputCat
//2. ����� ���� ��� printCat
//3. ����� �ʿ� Į�θ� ��� -> ��� �� ��� printKcal 
//3. ���α׷� ���� printExit
//-----------------------------------------------------