package exam1025;

import java.util.ArrayList;
import java.util.List;

/*
 * ��¥ : 2019/10/25
 * �̸� : �̴���
 * ���� : Exercise10-2
 */

public class BoardDao {
	public List<Board> getBoardList() {

		List<Board> list = new ArrayList<Board>();
		list.add(new Board("����1", "����1"));
		list.add(new Board("����2", "����2"));
		list.add(new Board("����3", "����3"));
		return list;
	}
}