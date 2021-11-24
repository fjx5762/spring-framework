package com.cafebabe.learn.spring.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * @author fongjx
 * @since 2021/11/21 13:56
 */
public class MyMergedBeanDefinitionPostProcessor implements MergedBeanDefinitionPostProcessor {

	/***
	 * 5
	 */
	public MyMergedBeanDefinitionPostProcessor() {

	}

	/***
	 * 11
	 * 处理合并的bd信息
	 * @param beanDefinition the merged bean definition for the bean
	 * @param beanType the actual type of the managed bean instance
	 * @param beanName the name of the bean
	 */
	@Override
	public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {

	}

	@Override
	public void resetBeanDefinition(String beanName) {
		MergedBeanDefinitionPostProcessor.super.resetBeanDefinition(beanName);
	}

}
