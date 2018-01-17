package com.shenma.paulfrank.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.shenma.ShenmaComponentApplication;
import com.shenma.base.file.FileUtils;
import com.shenma.paulfrank.dro.LogCollectorReq;
import com.shenma.paulfrank.service.LogCollector;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShenmaComponentApplication.class)
public class LogCollectorTest {
	
	@Autowired
	LogCollector logCollector;
	
	@Test
	public void collectorTest(){
		//String json = FileUtils.getFile().readTxtFile("/home/stevin/json.txt");
		String json = FileUtils.getFile().readTxtFile("D://doc/json.txt");
		LogCollectorReq req = new LogCollectorReq();
		req.setJson(json);
		logCollector.collector(req);
	}
	
	/*@Test
	public void sendMsg(){
		MQProducerMessage message = new MQProducerMessage();
		message.setBody(("hello  2018 "+System.currentTimeMillis()).getBytes());
		message.setKeys(String.valueOf(System.currentTimeMillis()));
		SendResult result = MQHelp.build().send(message);
		System.out.println(result);
	}*/
}
