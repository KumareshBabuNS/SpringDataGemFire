package pivotal.au.se.deptemp.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestGemFireTemplate 
{

	private ConfigurableApplicationContext ctx = null;
	
	public TestGemFireTemplate() 
	{
		ctx = new ClassPathXmlApplicationContext("application-context.xml");
	}

	public void run ()
	{
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TestGemFireTemplate test = new TestGemFireTemplate();
		System.out.println("\nStarting Spring Data GemFire Template Test.... ");
		test.run();
		System.out.println("\nAll done.... ");
		
	}
}
