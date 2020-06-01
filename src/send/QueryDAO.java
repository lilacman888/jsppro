// DAO(Data Access Object)
package send;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class QueryDAO {
	
	private static QueryDAO instance = new QueryDAO();
	
	public static QueryDAO getInstance() {
		return instance;
	}
	
	
	// 회원 가입
	public int insert(QueryDTO member) {
		int result = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		String url = "jdbc:oracle:thin:@localhost:1522:xe";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url,"totoro","totoro123");
			
			String sql="insert into query values(?,?,?,?,?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getId());
			pstmt.setString(3, member.getId());
			pstmt.setString(4, member.getId());
			pstmt.setString(5, member.getId());
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(pstmt != null) try { pstmt.close();}catch(Exception e) {}
			if(con != null) try { con.close();}catch(Exception e) {}
		}		
		
		return result;
	}

}
