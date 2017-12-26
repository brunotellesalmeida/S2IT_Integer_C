package com.s2itintegerc.integerc;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IntegercApplicationTests {

	private NewNumber newNumber = new NewNumber();

	@Test
	public void contextLoads() {
	}

	@Test
	public void numberMustReturnMinusOne(){
		int result = -1;
		int a = 123456;
		int b = 4321;

		Assert.assertEquals(-1,newNumber.generateC(a,b));
	}

	@Test
	public void numberMustReturn12345(){
		int result = 12345;
		int a = 135;
		int b = 24;

		Assert.assertEquals(-1,newNumber.generateC(a,b));
	}

}
