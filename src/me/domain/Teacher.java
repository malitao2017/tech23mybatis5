package me.domain;

public class Teacher {
	private int tid;//t_id
	private String name;//t_name
	
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Teacher [tid="+tid+",name="+name+"]";
	}
}
