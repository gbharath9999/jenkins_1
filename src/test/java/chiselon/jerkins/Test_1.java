package chiselon.jerkins;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test_1 {
	

	@Parameters(value="browser")
	@Test
	public void m1(String Browser)
	{
		
		System.out.println("hello1 .......:)");
		System.out.println(Browser);
	}
	@Parameters(value="browser1")
	@Test
	public void m2(String Broswer)
	{
		
		System.out.println("hello2 .......:)");
		System.out.println(Broswer);
	}
	@Test(groups={"smoke"})
	public void m3()
	{
		
		System.out.println("hello 3.......:)");
	}
	@Test(groups={"regression"})
	public void m4()
	{
		
		System.out.println("hello 4.......:)");
	}
	@Test(groups={"smoke"})
	public void m5()
	{
		
		System.out.println("hello 5.......:)");
	}
}
