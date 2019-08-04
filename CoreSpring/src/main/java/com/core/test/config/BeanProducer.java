package com.core.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.core.test.bean.Test3;
import com.core.test.bean.Test4;

@Configuration
public class BeanProducer {
	
	@Bean(name="mytest3")
	public Test3 getTest3() {
		return new Test3();
	}
	@Bean(name="mytest4")
	public Test4 getTest4() {
		return new Test4();
	}


}
