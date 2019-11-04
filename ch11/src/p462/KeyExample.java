package p462;

import java.util.HashMap;

import p461.Key;

public class KeyExample {
	public static void main(String[] args) {
		//Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> HashMap = new HashMap<Key, String>();
		
		// 식별키 "new Key(1)"로 "홍길동"을 저장함
		HashMap.put(new Key(1), "홍길동");
		
		//식뵬키 "new Key(1)"로 "홍길동"을 읽어옴
		String value = HashMap.get(new Key(1));
		System.out.println(value);
		
	}
}
