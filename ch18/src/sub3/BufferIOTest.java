package sub3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
날짜 : 2019/11/05
이름 : 이다함
내용 : 파일 버퍼 입출력 스트림 실습하기/교재 p1032
 */

public class BufferIOTest {
	public static void main(String[] args) throws IOException {

		String file1 = "C:\\Users\\java\\Desktop\\cameron.jpg";
		String file2 = "C:\\Users\\java\\Desktop\\cameron2.jpg";

		//입출력 스트림 생성 및 파일 연결
		FileInputStream fis = new FileInputStream(file1);
		FileOutputStream fos = new FileOutputStream(file2);
		
		//버퍼 스트림 생성 및 파일 연결
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		

		//입력 스트림으로 데이터 읽기
		while(true) {

			int data = bis.read();

			if(data == -1) {
				break; //더이상 읽을 데이터가 없으면
			}
			//출력 스트림으로 데이터 쓰기
			bos.write(data);
		}

		fis.close();
		fos.close();
		System.out.println();
		System.out.println("스트림 작업 끝");
	}
}
