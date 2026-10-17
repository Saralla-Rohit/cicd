package com.rohit;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CicdDemo1ApplicationTests {
	public static Logger logger=org.slf4j.LoggerFactory.getLogger(CicdDemo1ApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("test case executing");
		logger.info("test case executing 2nd log stmt");
		assertEquals(true, true);
	}

}
