package com.harish.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.harish.demo.JavaLogAggregationApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = JavaLogAggregationApplication.class)
@WebAppConfiguration
public class JavaLogAggregationApplicationTests {

	@Test
	public void contextLoads() {
	}

}
