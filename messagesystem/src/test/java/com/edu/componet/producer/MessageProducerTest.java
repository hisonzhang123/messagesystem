package com.edu.componet.producer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 消费者测试
 * 
 * @author zuohuai
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
@Component
public class MessageProducerTest {
	@Autowired
	private MessageProducer messageProducer;

	@Test
	public void test_env() throws Exception {
		messageProducer.sayHelloProducer();
	}

}
