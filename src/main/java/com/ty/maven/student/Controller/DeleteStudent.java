package com.ty.maven.student.Controller;

import com.ty.maven.studentdao.StudentDao;

public class DeleteStudent {
	public static void main(String[] args) {

		StudentDao dao = new StudentDao();

		dao.deleteStudentById(4);
	}
}
