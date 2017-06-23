package com.students.management.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.students.management.dao.GradeMapper;
import com.students.management.dao.entity.Grade;
import com.students.management.dao.entity.GradeExample;
import com.students.management.service.IGradeService;

@Service
public class GradeServiceImpl implements IGradeService {
	
	private static final Logger logger = LoggerFactory .getLogger(GradeServiceImpl.class);
	
	@Autowired
	private GradeMapper gradeMapper;
	
	@Override
	public void addOrUpdateGrade(Grade grade) {
		// TODO Auto-generated method stub
		int dbResult=gradeMapper.updateBySidSelective(grade);
		if(dbResult==1){
			logger.info("sId[{}]已经录入过成绩",grade.getsId().toString());
		}else{
			gradeMapper.insertSelective(grade);
		}
	}
	
	@Override
	public Grade selectBySId(Long sId) throws Exception{
		if(sId==null){
			return null;
		}
		GradeExample example=new GradeExample();
		example.createCriteria().andSIdEqualTo(sId);
		List<Grade> grades=gradeMapper.selectByExample(example);
		if(grades==null){
			return null;
		}else if(grades.size()==1){
			return grades.get(0);
		}else{
			throw new Exception("数据错误,一个人不能有两条成绩s");
		}
		
		
	}

}
