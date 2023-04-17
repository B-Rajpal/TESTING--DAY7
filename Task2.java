package Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Task2 {
	int a = 10;
	int b = 7;
	int c;
	@Test(priority =1)
	public void add() {
		c=a+b;
		System.out.println("Addition of "+a+" and "+b+":"+c);
		Assert.assertEquals(17, c);	
	}
	@Test(priority = 2)
	public void sub() {
		c=a-b;
		System.out.println("Subtraction of "+a+" and "+b+":"+c);
		Assert.assertEquals(3, c);	
	}
	@Test(priority = 3)
	public void mul() {
		c=a*b;
		System.out.println("Multiplication of "+a+" and "+b+":"+c);
		Assert.assertEquals(70, c);	
	}
	@Test(priority = 4)
	public void div() {
		c=a/b;
		System.out.println("Divison of "+a+" and "+b+":"+c);
		Assert.assertEquals(1, c);	
	}
	
	
}
