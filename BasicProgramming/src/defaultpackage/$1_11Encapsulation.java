package defaultpackage;
class Student{
	private int stuId;
	private String name;
	
	public void setStuId(int stuId) {
		this.stuId=stuId;
		System.out.println("StuId is accessed"); //we create a log
	}
	public int getStuId() {
		return stuId;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
}
public class $1_11Encapsulation {
	public static void main(String[] args) {
		 Student s = new Student();
		 s.setStuId(501);
		 s.setName("Anand");
		 System.out.println(s.getStuId());
		 System.out.println(s.getName());
	}
}
