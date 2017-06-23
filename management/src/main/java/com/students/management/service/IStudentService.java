package com.students.management.service;

import org.springframework.web.multipart.MultipartFile;

import com.students.management.dao.entity.Student;
import com.students.management.util.FortunePage;


public interface IStudentService {

	/**
	 * 分页查询
	 * @param start
	 * @param rows
	 * @return
	 */
	FortunePage<Student> selectByParams(int start,int rows);
	
	void add(Student student) throws Exception;
	
	void delete(Long id) throws Exception;
	
	/**
	 * 更新学生信息
	 * @param id
	 * @param student
	 * @return
	 */
	int modify(Student student);

	boolean batchImport(String name, MultipartFile file);
	
}
