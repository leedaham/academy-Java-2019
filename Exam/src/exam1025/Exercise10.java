package exam1025;

import java.util.List;

/*
 * ��¥ : 2019/10/25
 * �̸� : �̴���
 * ���� : Exercise10-3
 */

public class Exercise10 {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
	}
}
