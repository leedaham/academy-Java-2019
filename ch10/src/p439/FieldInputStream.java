package p439;

public class FieldInputStream {
	private String file;
	
	public FileInputStream(String file) {
		this.file = file;
	}
	public void read() {
		System.out.println(file + "을 읽습니다.");
	}
	
	@Override
	public void close() Throws Exception {
		System.out.println(file + "을 닫습니다.");
	}
}
