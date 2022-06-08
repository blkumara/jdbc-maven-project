package com.ty.maven.student.Controller;

import com.ty.maven.studentdao.StudentDao;
import com.ty.maven.studentdto.Student;

public class SaveStudent {
 public static void main(String[] args) {
		Student student=new Student();
		
		StudentDao dao=new StudentDao();
		
		student.setId(4);
		student.setName("Balaji");
		student.setEmail("Balaji@gmail.com");
		student.setPhone("9859658874");
		
		int res=dao.saveStudent(student);
		
		if(res>0)
		{
			System.out.println("Student Added");
		}
		else {
			System.out.println("Something Is Wrong");
		}
}
}
