package com.students.management.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.students.management.dao.StudentMapper;
import com.students.management.dao.entity.Student;
import com.students.management.dao.entity.StudentExample;
import com.students.management.service.IStudentService;
import com.students.management.util.FortunePage;
import com.students.management.util.ReadExcel;


@Service
public class StudentServiceImpl implements IStudentService{
	
	@Autowired
	private StudentMapper studentMapper;

	@Override
	public FortunePage<Student> selectByParams(int start, int rows) {
		// TODO Auto-generated method stub
		FortunePage<Student> page=new FortunePage<Student>(start, rows);
		StudentExample example=new StudentExample();
		example.setStart(page.getStart());
		example.setRows(rows);
		List<Student> list=studentMapper.selectByExample(example);
		int count=studentMapper.countByExample(example);
		page.setDataList(list);
		page.setDataNum(count);
		return page;
	}

	@Override
	public void add(Student student) throws Exception {
		studentMapper.insertSelective(student);
	}
	
	@Override
	public void delete(Long id)throws Exception{
		studentMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int modify(Student student) {
		// TODO Auto-generated method stub
		return studentMapper.updateByPrimaryKey(student);
	}
	
	@Override
	public boolean batchImport(String name,MultipartFile file){
        boolean b = false;
        //创建处理EXCEL
        ReadExcel readExcel=new ReadExcel();
        //解析excel，获取客户信息集合。
        List<Student> studentsList = readExcel.getExcelInfo(name ,file);

        if(studentsList != null){
            b = true;
        }
        
        //迭代添加客户信息（注：实际上这里也可以直接将customerList集合作为参数，在Mybatis的相应映射文件中使用foreach标签进行批量添加。）
        for(Student student:studentsList){
            studentMapper.insertSelective(student);
        }
        return b;
    }

}
