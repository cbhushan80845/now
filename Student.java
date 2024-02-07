package java8;

public class Student {
	private int id;
	private String name;
	private String SchoolName;
	private boolean isVoter;
	private float salary;
	
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchoolName() {
		return SchoolName;
	}
	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}
	public boolean isVoter() {
		return isVoter;
	}
	public void setVoter(boolean isVoter) {
		this.isVoter = isVoter;
	}
	public Student(int id, String name, String schoolName, boolean isVoter,float salary) {
		super();
		this.id = id;
		this.name = name;
		SchoolName = schoolName;
		this.isVoter = isVoter;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", SchoolName=" + SchoolName + ", isVoter=" + isVoter
				+ ", salary=" + salary + "]";
	}
	
	

}
