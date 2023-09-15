package protectedex.pack2;

import protectedex.pack1.A;

//A를 d가 상속받음
//다른 패키지여도 상속 관계는 protected에 접근(사용) 가능 
public class D extends A{
	public D() {
		super();
		this.field ="yes";
		this.method();
		
	}
}

