package com.cafebabe.learn.spring.processor.bean;

import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * @author fongjx
 * @since 2021/11/21 13:56
 */
public class MyMergedBeanDefinitionPostProcessor implements MergedBeanDefinitionPostProcessor {

	public MyMergedBeanDefinitionPostProcessor() {

	}

	@Override
	public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {

	}

	@Override
	public void resetBeanDefinition(String beanName) {
		MergedBeanDefinitionPostProcessor.super.resetBeanDefinition(beanName);
	}
}
