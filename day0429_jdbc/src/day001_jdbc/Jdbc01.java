package day001_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Jdbc01 {

	public static void main(String[] args) throws SQLException {
		 // 1. Oracle 접속 정보
        String dbURL = "jdbc:oracle:thin:@//localhost:1521/xe"; // 자신의 환경에 맞게 수정
        String dbUser = "MBC"; // 자신의 DB 사용자 ID
        String dbPassword = "MBC"; // 자신의 DB 비밀번호
        
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        // 3. 데이터베이스 연결
        conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
        System.out.println("Oracle 데이터베이스 연결 성공!");

        // 4. PreparedStatement 생성 (예: EMP 테이블에서 부서번호가 10인 직원 조회)
        String sql = "SELECT * FROM BOARD ORDER BY NO DESC";
        pstmt = conn.prepareStatement(sql);

        // 6. SQL 실행 (SELECT)
        rs = pstmt.executeQuery();
        System.out.println("결과수신");

        // 7. 결과처리
        while (rs.next()) { // 다음 행이 있으면 반복
            int no = rs.getInt("no"); // 컬럼 이름으로 값 가져오기
            String title = rs.getString("title");
            Date regDt = rs.getDate("reg_dt");
            System.out.println("no="+no+",title="+title+",regDt="+regDt);
        }
        // 자원반납
        rs.close();
        pstmt.close();
        conn.close();
	}

}
