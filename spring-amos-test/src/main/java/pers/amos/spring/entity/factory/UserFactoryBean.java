package pers.amos.spring.entity.factory;

import org.springframework.beans.factory.FactoryBean;
import pers.amos.spring.entity.User;

/**
 * @author amos wong
 * @create 2020-07-15 8:53 上午
 */

public class UserFactoryBean implements FactoryBean<User> {

	@Override
	public User getObject() throws Exception {
		return new User();
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}
}
