package com.ty.maven.student.Controller;

import com.ty.maven.studentdao.StudentDao;

public class UpdateStudent {
	public static void main(String[] args) {
		StudentDao dao=new StudentDao(); 
		dao.updateStudent(3, "varun", "varun9844@gamil.com", "7204509435");
	}
}
