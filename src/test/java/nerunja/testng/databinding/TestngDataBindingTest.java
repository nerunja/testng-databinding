package nerunja.testng.databinding;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;
import net.sf.testng.databinding.DataBinding;
import net.sf.testng.databinding.TestInput;
import net.sf.testng.databinding.TestOutput;

import org.testng.annotations.Test;


public class TestngDataBindingTest {

	@DataBinding
	@Test
	public void testMethod1(@TestInput(name = "userName") final String userName) {
	
		System.out.println("in TestngDataBindingTest.testMethod1()  userName = " + userName);

	}

	@DataBinding
	@Test
	public void testMethod2(@TestInput(name = "city") final String city,
			@TestInput(name = "state") final String state,
			@TestOutput(name = "executed") String executed) {
		System.out.println("in TestngDataBindingTest.testMethod2()  city,state  = " + city + ", " + state);
		executed = "Yesss";
	}
}