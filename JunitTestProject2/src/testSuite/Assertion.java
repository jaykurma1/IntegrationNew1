package testSuite;
import org.junit.Test;
import junit.framework.Assert;
public class Assertion {
  
	@Test
	public void frientlist()
	{ 
		int exp_list=100;
		int act_list=100;
		System.out.println("Start");	
		try
		{
		Assert.assertEquals(exp_list, act_list);}
		catch(Throwable t) 
		{ System.out.println("error encountered");
		  
		}
		
		System.out.println(act_list);	
	}
}
