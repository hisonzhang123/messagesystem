package com.edu.componet.consumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 消费者测试
 * @author zuohuai
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
@Component
public class MessageConsumerTest {
	@Autowired
	private MessageConsumer messageConsumer;
	
	@Test
	public void test_env() throws Exception{
		messageConsumer.sayHelloConsumer();
	}
}
