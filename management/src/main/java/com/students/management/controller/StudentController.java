package com.students.management.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.students.management.dao.entity.Grade;
import com.students.management.dao.entity.Student;
import com.students.management.service.IGradeService;
import com.students.management.service.IStudentService;
import com.students.management.util.DisplaytagPage;
import com.students.management.util.FortunePage;
import com.students.management.util.GsonUtil;


@Controller
@RequestMapping("/student")
public class StudentController {

	private static final Logger logger = LoggerFactory .getLogger(StudentController.class);
	
	@Autowired
	private IStudentService studentService;
	@Autowired
	private IGradeService gradeService;
	
	@RequestMapping(value = "/all")
	public String all(HttpServletRequest request,
			HttpServletResponse response, Model model) throws Exception {
		String pageNo = request.getParameter("page");
		String pageSize = request.getParameter("rows");

		// 分页参数处理
		Integer pno = 1;
		Integer ps = 20;
		if (pageNo != null && !pageNo.equals("")) {
			pno = Integer.parseInt(pageNo);
		}
		if (pageSize != null && !pageSize.equals("")) {
			ps = Integer.parseInt(pageSize);
		}
		DisplaytagPage<Student> dp = new DisplaytagPage<Student>();
		dp.setPageNumber(pno);
		dp.setObjectsPerPage(ps);
		FortunePage<Student> students = studentService.selectByParams(pno, ps);

		dp.setList(students.getDataList());
		dp.setTotalPages(students.getDataNum());
		String re = GsonUtil.getPageResultJsonString(dp);
		writeJsonToResponse(response, re);
		return null;
	}
	
	
	@ResponseBody
    @RequestMapping(value="/add")  
    public String add(Student student) throws Exception{
		try{
			studentService.add(student);
			return "1";
		}catch(Exception e){
			return "0";
		}
    }
	
	@ResponseBody
    @RequestMapping(value="/modify")  
    public String modify(Student student) throws Exception{
		int result=studentService.modify(student);
		return String.valueOf(result);
		
    }
	
	
	@ResponseBody
    @RequestMapping(value="/del")  
    public HashMap<String,String> del(Long id) throws Exception{
		HashMap<String,String> map=new HashMap<String,String>();
		try{
			studentService.delete(id);
			map.put("success", "success");
		}catch(Exception e){
			map.put("errorMsg", "用户不存在");
		}
		return map;
    }
	
	@ResponseBody
    @RequestMapping(value="/editGrade")  
    public String editGrade(Grade grade) throws Exception{
		try{
			gradeService.addOrUpdateGrade(grade);
			return "1";
		}catch(Exception e){
			return "0";
		}
	}
	
	 @ResponseBody
	 @RequestMapping(value = "addExcel", method = RequestMethod.POST)
     public String batchimport(@RequestParam(value="fileName") MultipartFile file,
             HttpServletRequest request,HttpServletResponse response) throws IOException{
		 logger.info("StudentController ..excel() start");
         //判断文件是否为空
         if(file==null) return null;
         //获取文件名
         String name=file.getOriginalFilename();
         //进一步判断文件是否为空（即判断其大小是否为0或其名称是否为null）
         long size=file.getSize();
         if(name==null || ("").equals(name) && size==0) return null;
         
         //批量导入。参数：文件名，文件。
         boolean b = studentService.batchImport(name,file);
         if(b){
              logger.info("批量导入EXCEL成功！");
              return "1";   
         }else{
        	 logger.info("批量导入EXCEL失败！");
              return "0";
         } 
     }

	/**
	 * 向页面返回json字符串
	 *
	 * @param json
	 * @throws IOException
	 */
	protected void writeJsonToResponse(HttpServletResponse res, String json)
			throws IOException {
		res.setHeader("Content-type", "text/html;charset=UTF-8");
		PrintWriter pw = res.getWriter();
		pw.write(json);
		pw.flush();
		pw.close();
	}

}
