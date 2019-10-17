package sub2;

public class Student extends Person{

	protected String school;
	protected String major; 

	//생성자
	public Student(String name, int age, String school, String major) {
		super(name, age);
		
		this.school = school;
		this.major = major;
	}
	
	
	public void hello() {
		System.out.println(name+" 입니다.");
		System.out.println(age+"살 입니다.");
		System.out.println(school+"학생 입니다.");
		System.out.println(major+"을 공부 합니다.");
	}
	
}
