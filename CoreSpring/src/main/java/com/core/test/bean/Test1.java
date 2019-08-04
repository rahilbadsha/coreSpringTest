package com.core.test.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;

public class Test1 {
	
	@Autowired
	Test2 test2;
@Lookup
	public Test2 getTest2() {
		return test2;
	}

	public void setTest2(Test2 test2) {
		this.test2 = test2;
	}
 


}
