package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before("amazon")
	public void initialization() {
		System.out.println("browser open");
	}
	
	@After
	public void tearDown() {
		System.out.println("browser closed");
	}
}

//Before hooks-->Background-->scenario-->After hook
