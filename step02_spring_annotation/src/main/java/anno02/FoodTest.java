package anno02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FoodTest {
	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("anno02/bean.xml");
		
		MyFoodMgr ob=factory.getBean("myFood", MyFoodMgr.class);
//		MyFoodMgr ob=factory.getBean("myFoodMgr", MyFoodMgr.class);
		System.out.println(ob);
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}
//MyFoodMgr [좋아하는 음식=Food [foodName=스파게티, foodPrice=7500], 싫어하는 음식=Food [foodName=보신탕, foodPrice=12000]]