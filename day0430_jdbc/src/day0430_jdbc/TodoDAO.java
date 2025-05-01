package day0430_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TodoDAO {

	public static void main(String[] args) {
		
	}
	public int insert(TodoVO Todo) {
		 String sql = "INSERT INTO Todo (no, title, content, due_dt,status) VALUES (Todo_seq.NEXTVAL, ?, ?, ?, ?)";

	        try (Connection conn = DbUtil.getConnection();
	             PreparedStatement ps = conn.prepareStatement(sql)) {

	            ps.setString(1, Todo.getTitle());
	            ps.setString(2, Todo.getContent());
	            ps.setDate(3, new Date( Todo.getDue_dt().getTime()));
	            ps.setString(4, Todo.getStatus());

	            return ps.executeUpdate();

	        } catch (Exception e) {
	            e.printStackTrace();
	            return 0;
	        }
	}
	
	public List<TodoVO> selectAll() {
		
		String sql = "SELECT no, priority, title, content, status, due_dt, reg_dt FROM TODO ORDER BY no DESC";
        List<TodoVO> list = new ArrayList<>();

        try (Connection conn = DbUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
            	TodoVO vo = new TodoVO();
                vo.setNo(rs.getInt("no"));
                vo.setPriority(rs.getInt("priority"));
                vo.setTitle(rs.getString("title"));
                vo.setContent(rs.getNString("content"));
                vo.setStatus(rs.getString("status"));
                vo.setDue_dt(rs.getDate("due_dt"));
                vo.setReg_dt(rs.getDate("reg_dt"));
                list.add(vo);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
	}

	public TodoVO selectOne(int no) {
		String sql = "SELECT no,  title, content, reg_dt FROM TODO WHERE no = ?";

        try (Connection conn = DbUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, no);
            
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                	TodoVO vo = new TodoVO();
                    vo.setNo(rs.getInt("no"));
//                    vo.setPriority(rs.getInt("priority"));
                    vo.setTitle(rs.getString("title"));
                    vo.setContent(rs.getNString("content"));
//                    vo.setStatus(rs.getString("status"));
//                    vo.setDue_dt(rs.getDate("due_dt"));
                    vo.setReg_dt(rs.getDate("reg_dt"));
                    return vo;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
	}
	
	public int update(TodoVO Todo) {
        String sql = "UPDATE TODO SET title = ?, content = ? WHERE no = ?";

        try (Connection conn = DbUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, Todo.getTitle());
            ps.setString(2, Todo.getContent());
            ps.setInt(3, Todo.getNo());

            return ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
	
	public int delete(int no) {
        String sql = "DELETE FROM TODO WHERE no = ?";

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
