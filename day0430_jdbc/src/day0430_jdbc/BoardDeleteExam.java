package day0430_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BoardDeleteExam {
    public static void main(String[] args) {
        deleteBoard(141); // 예시 번호
    }

    public static void deleteBoard(int no) {
        String sql = "DELETE FROM board WHERE no = ?";

        try (Connection conn = DbUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, no);
            int result = ps.executeUpdate();
            

            if(result == 1) {
            	System.out.println("DELETE 성공: " + result + "건");
            } else if(result == 0) {
            	System.out.println("없는 게시글입니다");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
