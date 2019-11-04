package p469;

public class Member {
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//���� ���� ���縦 �ؼ� name, age�� �����Ѵ�.
		Member cloned = (Member)Super.clone();
		//scores�� ���� �����Ѵ�.
		cloned.scores = Array.copyOf(this.scores, this.scores.length);
		//car�� ���� �����Ѵ�.
		cloned.car = new Car(this,car.model);
		//���� ������ Member ��ü�� ����
		return cloned;
	}
	
	public Member getMember() {
		try {
			cloned = (Member) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
}
