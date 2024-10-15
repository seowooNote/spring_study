package sample6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample6/bean2.xml");
		System.out.println("** Container 초기화 작업 **");
//		Developer developer = (Developer) factory.getBean("f1");
//		Engineer engineer = (Engineer) factory.getBean("f2");
//		System.out.println(developer.toString());
//		System.out.println(engineer.toString());
		Emp dev = factory.getBean("dev", Developer.class);
		Emp eng = factory.getBean("eng", Engineer.class);
		System.out.println(dev.toString());
		System.out.println(eng.toString());
	}
}
