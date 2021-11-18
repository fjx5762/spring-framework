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



