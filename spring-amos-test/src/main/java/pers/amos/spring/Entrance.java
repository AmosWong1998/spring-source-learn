package pers.amos.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import pers.amos.spring.controller.WelcomeController;
import pers.amos.spring.entity.User;
import pers.amos.spring.entity.factory.UserFactoryBean;
import pers.amos.spring.impl.WelcomeServiceImpl;

/**
 * @author amos wong
 * @create 2020-07-14 6:56 下午
 */

@Configuration // 表明当前类是配置类
@ComponentScan("pers.amos.spring") // 扫描的路径
public class Entrance {

	public static void main(String[] args) {
		String xmlPath  = "//Volumes/amos/amos/source/spring-framework-master/spring-amos-test/src/main/resources/spring-config.xml";
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(xmlPath);

		// 这样得到的是user对象 不是userFactoryBean
		User user = (User) applicationContext.getBean("userFactoryBean");
		System.out.println("user = " + user);
		// 得到UserFactoryBean需要加& 转义
		UserFactoryBean userFactoryBean = (UserFactoryBean) applicationContext.getBean("&userFactoryBean");
		System.out.println("userFactoryBean = " + userFactoryBean);
	}

	public static void main1(String[] args) {
		// 指定配置类
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Entrance.class);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}
		WelcomeServiceImpl welcomeService = (WelcomeServiceImpl) applicationContext.getBean("welcomeServiceImpl");
		welcomeService.sayHello("amos");
		WelcomeController welcomeController = (WelcomeController) applicationContext.getBean("welcomeController");
		welcomeController.sayHello();
	}
}
