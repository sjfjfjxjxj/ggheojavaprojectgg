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
//ctrl shift - :같은 화면이 반으로 갈림ㅋㅋㅋ
import java.util.Scanner;
import java.util.StringTokenizer;

//1. 정보입력(이름, 나이, 주소)
//2. 정보출력
//3. 정보저장(save)-파일로 내보내기(파일 제목: 이름)
//4. 정보불러오기(load)<-파일제목 입력해서 로드 후에 2 선택하면 정보출력됨
//0. 종료
//메뉴입력: 1
//그러니까 파일엔 일용자.txt->일용자/33/서울시종로구 
//콘솔 출력은 이름: 일용자
//            나이: 33       요런식으로

public class Exercise_IOStream {
	private static String name; //받은 값들을 저장하기위해 얘네가 필요해
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
    		default : System.out.println("1~4사이의 숫자를 입력해주세요");break; 
    		}
    	}
    	
    	
    }
    
    static int printMenu() { //ctrl+alt+↓방향키 = 복붙!
    	Scanner sc = new Scanner(System.in);
    	System.out.println("1. 정보입력");
    	System.out.println("2. 정보출력");
    	System.out.println("3. 정보저장(save 후 입력받은 이름이 파일명)");
    	System.out.println("4. 정보불러오기(load 후 2번으로 출력) ");
    	System.out.println("0. 종료하기");
    	System.out.println("메뉴 입력: ");
    	int select = sc.nextInt();
    	return select;
    	
    }
    
    
    static void insert() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("이름 입력: ");
    	name = sc.next();
    	System.out.println("나이 입력: ");
    	age = sc.nextInt();
    	System.out.println("주소 입력: ");
    	sc.nextLine();//이거를 버퍼제거한다고 하데?
    	adress = sc.nextLine();
    	
    }
    
    static void print() {
    	System.out.println("======정보출력======");
    	System.out.println("이름 : " + name);
    	System.out.println("나이 : " + age);
    	System.out.println("주소 : " + adress);
    	System.out.println("====================");
    	
    	
    }
    
    static void save() {//출력스트림(프로그램에서 밖으로file.txt 내보내는것)
    	Writer os = null;
    	
    	try {
    		String result = name + "/" + age + "/" + adress;
			os = new FileWriter("src/iostream/" + name +".txt");
			os.write(result);
			os.flush();
			System.out.println("저장완료되엇습니다");
			System.out.println("====================");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    	
    }
    
    static void load() {
    	Reader reader = null; //입력스트림 리더 쓰자!
    	BufferedReader bfReader = null; //빠르게 읽으려고 버퍼스트림 쓰자. 개행단위 한줄씩 읽어옴
    	Scanner sc = new Scanner(System.in);
    	System.out.println("파일명입력: ");
    	String fileName = sc.next();
    	String result = "";
    	try {
			reader = new FileReader("src/iostream/" + fileName + ".txt");
			bfReader = new BufferedReader(reader);
			result = bfReader.readLine(); // 오잉 파일 읽으면 오잉/11/오잉 읽어옴->슬래시 기준으로 잘라야해
			// 슬래시 기준으로 자르는 두가지  1.split() , 2.StringTokenizer★많이 쓰니까 알아두기
			StringTokenizer st = new StringTokenizer(result, "/");
			//인덱스 신경 안쓰고 넥스트토큰만 쓰면된대(맨 처음 넥스트토큰이 첫번째 값...)
			name = st.nextToken();
			age = Integer.parseInt(st.nextToken()); //'스트링'토크나이저로 인트를 읽어야하니까 래퍼클래스로ㄱㄱ
			adress = st.nextToken();
			System.out.println("로드가 완료되었습니다");
			System.out.println("정보 출력 하시려면 2번을 눌러주세요");
			System.out.println("====================");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    }
}







