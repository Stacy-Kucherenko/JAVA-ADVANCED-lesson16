package ua.lviv.lgs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ua.lviv.lgs.dao.StudentDao;
import ua.lviv.lgs.domain.Student;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);

		StudentDao studentDao = context.getBean(StudentDao.class);
		
		studentDao.create(new Student(1, "Вася", 22));
		studentDao.create(new Student(2, "Коля", 18));
		studentDao.readAll().stream().forEach(System.out::println);
		System.out.println();
		
		studentDao.update(new Student(2, "Петя", 20));
		System.out.println(studentDao.readById(2));
		System.out.println();
				
		studentDao.delete(1);
		studentDao.readAll().stream().forEach(System.out::println);			
	}

}