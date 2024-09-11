package com.lilly.adds.test.bench;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestBenchApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("this function is invoked");
	}

}
