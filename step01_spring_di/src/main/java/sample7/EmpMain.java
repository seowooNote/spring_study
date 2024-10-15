package sample7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample7/bean2.xml");
		System.out.println("** Container 초기화 작업 **");
		Developer dev = factory.getBean("dev", Developer.class);
		Engineer eng = factory.getBean("eng", Engineer.class);
		System.out.println(dev.toString());
		System.out.println(eng.toString());
	}
}
