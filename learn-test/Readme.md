### 核心组件分析

#### 基础接口

@org.springframework.core.io.Resource
@org.springframework.core.io.ResourceLoader

@org.springframework.beans.factory.BeanFactory
@org.springframework.beans.factory.config.BeanDefinition
@org.springframework.beans.factory.support.BeanDefinitionReader
@org.springframework.beans.factory.support.BeanDefinitionRegistry
@org.springframework.context.ApplicationContext
@org.springframework.beans.factory.Aware

#### 生命周期处理器

后置
@org.springframework.beans.factory.config.BeanFactoryPostProcessor
@org.springframework.beans.factory.config.BeanPostProcessor
@org.springframework.beans.factory.InitializingBean



applicationContext 与 beanFactory 区别



通过不同资源(Resource)的来源解析出 Bean的定义信息（BeanDefinition）


创建Bean (doCreateBean)-> 
1、实例化 InstantiateBean， DefaultSingletonBeanRegistry 
1.2 属性赋值 populateBean，
2、初始化 initializeBean  
2.1 遍历 Bean后置处理器 （ApplicationContextAwareProcessor.postProcessBeforeInitialization）
2.1.1 执行回调 invokeAwareInterfaces



后置处理器， 观察他们的实现和继承

BeanPostProcessor  

BeanFactoryPostProcessor






#### 三种增强器

1、BeanFactoryPostProcessor 
2、BeanPostProcessor
3、InitializingBean

### 生命周期

invokeBeanFactoryPostProcessors  
    // 核心组件创建  => // 核心组件执行
    BeanDefinitionRegistryPostProcessor  => 
        postProcessBeanDefinitionRegistry (增强Bean定义信息的注册中心)
        postProcessBeanFactory
    