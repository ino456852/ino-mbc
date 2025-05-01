package day0430_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BoardUpdateExam {
    public static void main(String[] args) {
        updateBoard(141, "제목 수정", "내용 수정"); // 예시 번호
    }

    public static void updateBoard(int no, String title, String content) {
        String sql = "UPDATE board SET title = ?, content = ? WHERE no = ?";

        try (Connection conn = DbUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, title);
            ps.setString(2, content);
            ps.setInt(3, no);

            int result = ps.executeUpdate();
            System.out.println("UPDATE 성공: " + result + "건");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

