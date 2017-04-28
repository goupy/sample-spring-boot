package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Ignore; 

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		assert(0==0);
	}
	@Test
	public void contextLoads2() {
		assert(1==2);
	}
	@Ignore
	@Test
	public void testDivide() {
		assert(0==0);
	}

}
