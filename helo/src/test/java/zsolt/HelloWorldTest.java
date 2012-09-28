package zsolt;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testSayHi() {
		HelloWorld greet = new HelloWorld();
		assertEquals("Hello World", greet.sayHi());
	}

}
