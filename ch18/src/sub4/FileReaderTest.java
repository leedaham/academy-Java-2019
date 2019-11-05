package sub4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/*
날짜 : 2019/11/05
이름 : 이다함
내용 : 파일 리더 스트림 실습하기/교재 p1032
 */

public class FileReaderTest {
	public static void main(String[] args) throws IOException {

		String file1 = "C:\\Users\\java\\Desktop\\sample1.txt";
		// String file2 = "C:\\Users\\java\\Desktop\\sample2.txt";

		//입력 스트림 생성 및 파일 연결
		FileReader fr = new FileReader(file1);

		//출력 스트림 생성 및 파일 연결

		//입력 스트림으로 데이터 읽기
		while(true) {

			int data = fr.read();

			if(data == -1) {
				break; //더이상 읽을 데이터가 없으면
			}

			//출력 스트림으로 데이터 쓰기
			char ch = (char) data;
			System.out.print(ch);
		}

		fr.close();

		System.out.println("\n스트림 작업 끝");
	}
}

