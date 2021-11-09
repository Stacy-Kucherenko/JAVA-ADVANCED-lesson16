package ua.lviv.lgs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ua.lviv.lgs.dao.StudentDao;
import ua.lviv.lgs.dao.impl.StudentDaoImpl;

@Configuration
public class StudentDaoConfig {

	@Bean
	StudentDao studentDao() {
		return new StudentDaoImpl();
	}
}
