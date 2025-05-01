package day0430_jdbc;



import java.sql.*;
import java.util.*;

public class BoardDAO {

    public int insert(BoardVO board) {
        String sql = "INSERT INTO board (no, title, writer, content) VALUES (board_seq.NEXTVAL, ?, ?, ?)";

        try (Connection conn = DbUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, board.getTitle());
            ps.setString(2, board.getWriter());
            ps.setString(3, board.getContent());

            return ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public List<BoardVO> selectAll() {
        String sql = "SELECT no, title, writer, content, reg_dt FROM board ORDER BY no DESC";
        List<BoardVO> list = new ArrayList<>();

        try (Connection conn = DbUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                BoardVO vo = new BoardVO();
                vo.setNo(rs.getInt("no"));
                vo.setTitle(rs.getString("title"));
                vo.setWriter(rs.getString("writer"));
                vo.setContent(rs.getString("content"));
                vo.setReg_date(rs.getDate("reg_dt"));
                list.add(vo);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public BoardVO selectByNo(int no) {
        String sql = "SELECT no, title, writer, content, reg_dt FROM board WHERE no = ?";

        try (Connection conn = DbUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, no);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    BoardVO vo = new BoardVO();
                    vo.setNo(rs.getInt("no"));
                    vo.setTitle(rs.getString("title"));
                    vo.setWriter(rs.getString("writer"));
                    vo.setContent(rs.getString("content"));
                    vo.setReg_date(rs.getDate("reg_dt"));
                    return vo;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public int update(BoardVO board) {
        String sql = "UPDATE board SET title = ?, content = ? WHERE no = ?";

        try (Connection conn = DbUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, board.getTitle());
            ps.setString(2, board.getContent());
            ps.setInt(3, board.getNo());

            return ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int delete(int no) {
        String sql = "DELETE FROM board WHERE no = ?";

        try (Connection conn = DbUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, no);
            return ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}

