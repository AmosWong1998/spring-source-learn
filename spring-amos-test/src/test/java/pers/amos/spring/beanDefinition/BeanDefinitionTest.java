package pers.amos.spring.beanDefinition;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @author amos wong
 * @create 2020-06-29 4:22 下午
 *
 * 第三节 IoC 之加载 BeanDefinition
 * 调试BeanDefinition的加载过程
 */

public class BeanDefinitionTest {
	@Test
	public void testBeanDefinition() {
		// 获取资源
		ClassPathResource resource = new ClassPathResource("bean.xml"); // <1>
		// 创建beanFactory
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory(); // <2>
		// 根据新建的 BeanFactory 创建一个 BeanDefinitionReader 对象，该 Reader 对象为资源的解析器
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory); // <3>
		// 装载资源
		reader.loadBeanDefinitions(resource); // <4>




	}
}
