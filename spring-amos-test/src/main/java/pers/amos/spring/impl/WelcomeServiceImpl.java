package pers.amos.spring.impl;

import org.springframework.stereotype.Service;
import pers.amos.spring.IWelcomeService;

/**
 * @author amos wong
 * @create 2020-07-14 6:56 下午
 */

@Service
public class WelcomeServiceImpl implements IWelcomeService {
	@Override
	public void sayHello(String name) {
		System.out.println("hello [" + name + "] welcome learn spring source code.");
	}
}
