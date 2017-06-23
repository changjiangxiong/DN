package com.students.management.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.gson.Gson;
import com.students.management.dao.entity.Student;
import com.students.management.service.IStudentService;
import com.students.management.util.FortunePage;

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
//	private ApplicationContext ac = null;
	@Resource
	private IStudentService studentService = null;

	@Test
	public void test1() {
		FortunePage<Student> pages=studentService.selectByParams(1, 10);
		System.out.println(new Gson().toJson(pages));
	}

}