package day0430_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class JdbcConnectionExam {

	public static void main(String[] args) {

		// 1. Oracle 접속 정보
		String dbURL = "jdbc:oracle:thin:@//localhost:1521/xe"; // 자신의 환경에 맞게 수정
		String dbUser = "MBC"; // 자신의 DB 사용자 ID
		String dbPassword = "MBC"; // 자신의 DB 비밀번호

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			// 2. JDBC 드라이버 로드 (생략 가능 - JDBC 4.0 이상)
			// Class.forName("oracle.jdbc.driver.OracleDriver");
			// System.out.println("Oracle 드라이버 로드 성공");

			// 3. 데이터베이스 연결
			conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
			System.out.println("Oracle 데이터베이스 연결 성공!");

			// 4. PreparedStatement 생성 (예: EMP 테이블에서 부서번호가 10인 직원 조회)
			String sql = "SELECT * FROM BOARD ORDER BY NO";
			pstmt = conn.prepareStatement(sql);

			// 5. 파라미터 설정 (?)
//			pstmt.setInt(1, 10); // 첫 번째 '?'에 정수 값 10 설정

			// 6. SQL 실행 (SELECT)
			rs = pstmt.executeQuery();

			// 7. 결과 처리
			System.out.println("--- 부서번호 10번 직원 목록 ---");
			while (rs.next()) { // 다음 행이 있으면 반복
				int no = rs.getInt("NO"); // 컬럼 이름으로 값 가져오기
				String title = rs.getString("TITLE");
				String writer = rs.getString("WRITER");
				String content = rs.getString("CONTENT");
				Date date = rs.getDate("REG_DT");
				System.out.println(no+" , "+title+" , "+writer+" , "+content+" , "+date);
//				System.out.println("NO= "+no+", TITLE= "+title+", WRITER= "+writer+", CONTENT= "+content+", DATE="+date);
			}

		} catch (SQLException e) {
			System.err.println("데이터베이스 연결 또는 SQL 실행 오류!");
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("기타 오류 발생!");
			e.printStackTrace();
		} finally {
			// 8. 자원 해제 (생성 역순) - 매우 중요!
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
				System.out.println("데이터베이스 자원 해제 완료.");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
