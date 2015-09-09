package test.action;

import test.dao.StudentDao;
import test.dto.Student;

import com.opensymphony.xwork2.ActionSupport;

public class InputSubmitAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6282026151767542651L;
	private Student student;

	@Override
	public String execute() {
		StudentDao dao = new StudentDao();
		if (dao.add(student)) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
