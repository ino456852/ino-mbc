package day001_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BoardInsertExam {

	public static void main(String[] args) {
		insertBoard("제목2", "김길동", "내용입니다.");
    }

    public static void insertBoard(String title, String writer, String content) {
        String sql = "INSERT INTO board (no, title, writer, content) VALUES (BOARD_SEQ.NEXTVAL, ?, ?, ?)";

        try (Connection conn = DbUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, title);
            ps.setString(2, writer);
            ps.setString(3, content);

            int result = ps.executeUpdate();
            System.out.println("INSERT 성공: " + result + "건");

        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
