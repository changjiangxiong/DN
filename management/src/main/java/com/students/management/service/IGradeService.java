package com.students.management.service;

import com.students.management.dao.entity.Grade;

public interface IGradeService {

	void addOrUpdateGrade(Grade grade);

	/**
	 * 查询用户的成绩
	 * @param sId
	 * @return
	 * @throws Exception 
	 */
	Grade selectBySId(Long sId) throws Exception;
}
