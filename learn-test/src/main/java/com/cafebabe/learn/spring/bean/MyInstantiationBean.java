package com.cafebabe.learn.spring.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * 生命周期接口
 *
 * @author fongjx
 * @since 2021/11/21 13:52
 */
@Component
public class MyInstantiationBean implements InitializingBean {

	/***
	 * 实现接口 InitializingBean 可以自己
	 * @throws Exception
	 */

	@Override
	public void afterPropertiesSet() throws Exception {

	}
}
