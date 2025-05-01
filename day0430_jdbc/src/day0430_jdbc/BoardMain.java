package day0430_jdbc;

import java.util.List;

public class BoardMain {
	public static void main(String[] args) {
		BoardDAO dao = new BoardDAO();

		// INSERT
        BoardVO newBoard = new BoardVO();
        newBoard.setTitle("VO 사용 예제");
        newBoard.setWriter("이순신");
        newBoard.setContent("VO + DAO 구조로 작성한 예제입니다.");
        dao.insert(newBoard);

		// SELECT ALL
        List<BoardVO> list = dao.selectAll();
        for (BoardVO b : list) {
            System.out.printf("%d / %s / %s / %s%n", b.getNo(), b.getTitle(), b.getWriter(), b.getReg_date());
        }

		// SELECT BY NO
		BoardVO one = dao.selectByNo(142);
		if (one != null) {
			System.out.println("조회된 게시글: " + one);
			// UPDATE
			one.setTitle("수정된 제목");
			one.setContent("수정된 내용입니다.");
			dao.update(one);
			
			// 수정확인
			System.out.println("수정확인: "+dao.selectByNo(142));
		} else {
			System.out.println("없거나 삭제된 게시글입니다");
		}

        // DELETE
        int r = dao.delete(142);
        if(r == 0) {
        	System.out.println("삭제실패, 없거나 삭제된 게시글입니다");
        } else {
        	System.out.println("삭제완료");
        }
	} // end main
} // end class