package sub4;

public class Calc {
	
	//½Ì±ÛÅæ(Á¤Àû) °´Ã¼
	private static Calc instance = new Calc(); //½Ö´çÈ÷ °í±ŞÅ×Å©´ĞÀÓ ¿Ü¿ì¼À. instance¶ó´Â Calc¸¦ method area¿¡ ¿Ã·ÁµÒ.
	
	public static Calc getInstance() {
		return instance;
	} //Âß ~ °ø½ÄÀÌ¾ß.
	
	private Calc() {}
	
	public int plus (int x , int y) {
		int z = x + y;
		return z;
	}

	public int minus (int x , int y) {
		int z = x - y;
		return z;
	}
	public int multi (int x , int y) {
		int z = x * y;
		return z;
	}
	public int div (int x , int y) {
		int z = x / y;
		return z;
	}
}
