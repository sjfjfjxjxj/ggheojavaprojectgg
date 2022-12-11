package com.kh.day09.overriding;

//실행!
public class MethodOverridingEx {
	static void paint(Shape p) {
		// Shape p = new Line();
		p.draw(); // 원래 부모거 호출하면 부모거 실행돼야하는데

	}

	public static void mina(String[] args) {
		Line line = new Line(); // 오버라이딩하면 무조건 그걸로 실행...
//		line.draw();//뉴라인이라는 객체가 생성돼있기 때문에 이거 기준으로 실행되는거래
		paint(line);
		paint(new Rect());
		paint(new Circle());
	}
}
