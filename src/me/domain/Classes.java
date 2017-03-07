package me.domain;

import java.util.List;

public class Classes {
	private int cid;//c_id
	private String name;//c_name
	/**
	 * 一对一：表中字段teacher_id 对应此对象属性
	 */
	private Teacher teacher;
	
	/**
	 * 一对多：集合形式
	 */
	private List<Student> students;
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "Classes[cid="+cid+",name="+name+",teacher="+teacher+" , student="+students+"]";
	}
	
}
