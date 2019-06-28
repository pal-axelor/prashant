import com.google.inject.Provider;
import com.google.inject.Singleton;

public class PrajMain {
	
	Provider<Demo> demoProvider;
	public static void main(String[] args) {
		Demo demo1 = new Demo();
		Demo demo2 = new Demo();
		Demo demo3 = new Demo();
		Demo demo4 = new Demo();
		Demo demo5 = new Demo();
		
		System.out.println(demo1);
		System.out.println(demo2);
		System.out.println(demo3);
		System.out.println(demo4);
		System.out.println(demo5);
		
	}
}
@Singleton
class Demo {
//	private static Demo demo = null;
//	private Demo() {}
//	
//	public static Demo getInstance() {
//		if(demo == null) {
//			demo = new Demo();
//		}
//		return demo;
//	}
}

