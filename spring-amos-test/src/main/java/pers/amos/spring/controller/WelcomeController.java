package pers.amos.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pers.amos.spring.IWelcomeService;

/**
 * @author amos wong
 * @create 2020-07-15 8:29 上午
 */
@Controller
public class WelcomeController {

	@Autowired
	private IWelcomeService welcomeServiceImpl;

	public void sayHello() {
		welcomeServiceImpl.sayHello("controller");
	}
}
