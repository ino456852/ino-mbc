package day0430_jdbc;

import java.sql.Date;
import java.util.List;

public class TodoMain {

	public static void main(String[] args) {
		
		
		TodoDAO dao = new TodoDAO();

		// INSERT
		TodoVO newTodo = new TodoVO();
		newTodo.setTitle("VO 사용 예제");
		newTodo.setContent("이순신");
		newTodo.setDue_dt(new Date(2025-1900,4,30));
        dao.insert(newTodo);
        System.out.println("등록 성공");

		// SELECT ALL
		List<TodoVO> list = dao.selectAll();
		for (TodoVO b : list) {
			System.out.println("no=" + b.getNo() + " , priority=" + b.getPriority() + " , title=" + b.getTitle()
					+ " , content=" + b.getContent() + " , status=" + b.getStatus() + " , due_dt=" + b.getDue_dt()
					+ " , reg_dt=" + b.getReg_dt());
		}

		// SELECT BY NO
		TodoVO one = dao.selectOne(2);
		if (one != null) {
			System.out.println("조회된 게시글: " + one);
			// UPDATE
			one.setTitle("방금수정 제목");
			one.setContent("수정된 내용입니다.");
			dao.update(one);

			// 수정확인
			System.out.println("수정확인: " + dao.selectOne(2));
		} else {
			System.out.println("없거나 삭제된 게시글입니다");
		}

		// DELETE
		int r = dao.delete(2);
		if (r == 0) {
			System.out.println("삭제실패, 없거나 삭제된 게시글입니다");
		} else {
			System.out.println("삭제완료");
		}
	}

}
