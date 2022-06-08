package com.ty.maven.student.Controller;

import com.ty.maven.studentdao.StudentDao;
import com.ty.maven.studentdto.Student;

public class GetStudentById {
	public static void main(String[] args) {
		
		StudentDao dao=new  StudentDao();
		dao.getStudentVById(1);
		
	}
}
