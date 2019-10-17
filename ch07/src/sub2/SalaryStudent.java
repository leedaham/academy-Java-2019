package sub2;

public class SalaryStudent extends Student {

	private String company; 

	//생성자
	public SalaryStudent(String name, int age, String school, String major, String company) {
		super(name, age, school, major);
		
		this.company = company;
	}
	
	
	public void hello() {
		System.out.println(name+" 입니다.");
		System.out.println(age+"살 입니다.");
		System.out.println(school+"학생 입니다.");
		System.out.println(major+"을 공부 합니다.");
		System.out.println(company+"에 재직중 입니다.");
	}
}
