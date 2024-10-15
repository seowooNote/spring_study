package sample4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloSpring {
	public static void main(String[] args) {
//		ApplicationContext factory = new ClassPathXmlApplicationContext("sample4/bean1.xml");
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample4/bean2.xml");
		System.out.println("** Container 초기화 작업 **");
		MessageBean bean = (MessageBean) factory.getBean("messageBean");
		
		// XML를 통한 주입
		bean.sayHello(); // 주입(DI)
		
		// 메서드에 의한 대입
		bean.sayHello("banana", 10000); // 대입
	}
}
