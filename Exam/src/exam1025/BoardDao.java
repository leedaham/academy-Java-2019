package exam1025;

import java.util.ArrayList;
import java.util.List;

/*
 * 날짜 : 2019/10/25
 * 이름 : 이다함
 * 문항 : Exercise10-2
 */

public class BoardDao {
	public List<Board> getBoardList() {

		List<Board> list = new ArrayList<Board>();
		list.add(new Board("제목1", "내용1"));
		list.add(new Board("제목2", "내용2"));
		list.add(new Board("제목3", "내용3"));
		return list;
	}
}
