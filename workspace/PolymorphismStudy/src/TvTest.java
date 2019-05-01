
public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tv tv = new Tv();
		
		tv.channelUp();
		
		System.out.println(tv.channel);
		System.out.println("=========================================");
		
		CaptionTv cTv = new CaptionTv();
		
		cTv.channelUp();
		cTv.channelUp();
		
		System.out.println(cTv.channel);
		
		cTv.caption();
		
		System.out.println("=========================================");
		
		
//		다형성
//		객체(주소값)를 대입연산자로 쓰면 참조한다고 한다 -> 참조한다고 하면 객체(주소값)을 가져온다는 것
		
		Tv tvObj = new CaptionTv();
//		부모				자식
//	부모는 자식을 가질수있다(포옹해줄수있다)(참조할수있다) -> extends 하면 자식객체를 부모안에 들어갈수있다	
//	자식은 부모에게 참조시킬수 있다	
		tvObj.channelUp();
		tvObj.channelUp();
		tvObj.channelUp();
		tvObj.channelDown();
		
		System.out.println(tvObj.channel);
		
//		tvObj.caption(); 			// 이건 왜안돼?????오류: The method caption() is undefined for the type Tv
//		이거 헷갈림 기억할것!!!!!! // Tv라는 그릇에 caption 기능이 없으므로
//		오래된 Tv설계도(클래스)를 이용하여 만든 tvObj(변수)는 -> caption()안에서 접근가능한것들은 Tv에 존재하는 것들이다
//												-> caption 기능은 원래 Tv설계도에 없었으므로 사용할수 없다
//		예) 오래된 설계도로 만든 리모컨으로 캡션티비에 작동시킬수 있는 기능은 오래된 설계도에 있는 버튼기능들 뿐이다
//			왜냐하면 이 리모컨에 캡션기능 버튼이 존재하지않는다
//		Tv tvObj = new CaptionTv(); // 이렇게 만들어진것은 -> 이전 Tv설계도로 만들어진것은 최신의 캡션을 사용할수 없다 
		
		
		tvObj.power();   // 부모의 것을 재정의(CaptionTv클래스에서 , 메서드를 오버라이딩 한것)
		
			
		
		System.out.println("=========================================");
		
//		다형성은 상속을 몰라서는 절대 이해할수 없다 (SmartTv extends Tv 해줘야 아래가 오류가 아님)
//		Tv smartTv = new SmartTv();
		

		System.out.println("여기 위에 다=========================================");
		
//		CaptionTv cTv2 = new Tv();  //오류: type mismatch: cannot convert from Tv to CaptionTv
//		(참조변수)		(인스턴스)						
		
//		티비에서 캡션티비로 형변환 시킬수 없다(자식은 마음이 좁아 부모를 다 안을수없다)
//		보기엔 자식이 기능이 더 많아서(크기가 더 큰느낌으로) 이렇게 객체를 생성이 될것같아보였지만 
//		다형성의 개념: 부모는 자식을 안을수 있으나(가질수있으나), 자식은 부모를 안을수없다(가질수없다)
//		부모는 유일, 자식은 여러명일수 있다 -> 그러므로 부모를 자식에 넣으려고 할수 없다
		// Tv에는(객체)는 새 리모컨(캡션기능을 가진)으로 캡션기능을 작동시킬수 없다(원래도 Tv에는 캡션기능이 없으므로)
		// 자식은 부모보다 멤버의 갯수가 많다 -> 그래서 부모를 자식에게 담으려고 했으므로 오류남

		
		
		
		
//		[ 다형성 (Polymorphism) ] 
//		객체지향개념이란?
//		여러 가지 형태를 가질 수 있는 능력
//		-> 한 타입의 참조변수로 여러 타입의 객체를 참조할 수 있도록 함
//		-> 부모(조상)클래스 타입의 참조변수로
//		자손클래스의 인스턴스를 참조할 수 있다
//		부타자참(부모의 타입으로 자식을 참조한다)
//		다형성은 상속을 몰라서는 절대 이해할수 없다
//
//		같은 타입의 인스턴스지만 참조변수의 타입에 따라 사용할 수 있는 멤버의 개수가 다르다
		
//		자식의 참조변수에 부모의 인스턴스를 참조할 경우 에러가 발생하는 이유는
//		실제 인스턴스인 Tv의 멤버 개수보다 참조변수 자막Tv가 사용 할 수 있는 멤버 개수가 더 많기 때문이다
//		그래서 이를 허용하지 않는다
		
//		참조변수가 사용할 수 있는 멤버의 개수는
//		인스턴스의 멤버 개수보다 같거나 적어야 한다.
//
//		[참고]
//		클래스는 상속을 통해서  확장될 수는 있어도
//		축소될수는 없다.
//		즉, 조상 인스턴스의 멤버 개수는
//		자손 인스턴스의 멤버 개수보다 항상 적거나 같다.
		
//		요약
//		- 조상타입의 참조변수로 자손타입의 인스턴스를 참조할 수 있다
//		- 반대로 자손타입의 참조변수로 조상타입의 인스턴스를 참조할 수는 없다
		
		
		
		
	}

}