package pj.webt5.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pj.webt5.connection.DBConnection;
import pj.webt5.dao.ContentDao;
import pj.webt5.dao.UserDao;
import pj.webt5.model.ContentModel;



public class ContentDaoImpl extends DBConnection implements ContentDao{
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	UserDao userdao = new UserDaoImpl();
	@Override
	public void insert(ContentModel content) {
		String sql ="INSERT INTO `cmsnhom5`.`content` (`title`, `brief`, `content`, `createdate`, `updatetime`, `authorid`) VALUES ( ?, ?, ?, ?, ?, ?);";
		try {
			conn = DBConnection.getConnect();
			ps = conn.prepareStatement(sql);
			ps.setString(1, content.getTittle());
			ps.setString(2, content.getBrief1());
			ps.setString(3, content.getContent1());
			ps.setString(4, content.getCreatedate1());
			ps.setString(5,content.getUpdatetime1());
			ps.setInt(6, content.getUserid());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void delete(int id) {
		String sql = "delete from content where id = ?";
		try {
			conn = DBConnection.getConnect();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public List<ContentModel> getallbyid(int id) {
		List<ContentModel> listcontent = new ArrayList<ContentModel>();
		String sql ="SELECT * FROM cmsnhom5.content where authorid =?;";
		
		try {
			
			Connection con = super.getConnect();
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				listcontent.add(new ContentModel(	rs.getInt(1),
													rs.getString(2),
													rs.getString(3),
													rs.getString(4),
													rs.getString(5),
													rs.getString(6),
													rs.getInt(7)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listcontent;
	}
	@Override
	public int getTotalContent() {
		String sql =" select count(content.id) from content";
		try {
			new DBConnection();
			conn = DBConnection.getConnect();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				return rs.getInt(1);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}
	@Override
	public void update(ContentModel content) {
		String sql ="UPDATE `cmsnhom5`.`content` SET `title` = ?, `brief` = ?, `content` = ?,`updatetime` = ? WHERE (`id` = ?);";
		try {
			new DBConnection();
			conn = DBConnection.getConnect();
			ps = conn.prepareStatement(sql);
			ps.setString(1, content.getTittle());
			ps.setString(2, content.getBrief1());
			ps.setString(3, content.getContent1());
			ps.setString(4, content.getUpdatetime1());
			ps.setInt(5, content.getCid());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public ContentModel getbyid(int id) {
		String sql =" SELECT * FROM cmsnhom5.content where id=?;";
		try {
			new DBConnection();
			conn = DBConnection.getConnect();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				ContentModel content = new ContentModel();
				content.setCid(rs.getInt(1));
				content.setTittle(rs.getString(2));
				content.setBrief1(rs.getString(3));
				content.setContent1(rs.getString(4));
				content.setCreatedate1(rs.getString(5));
				content.setUpdatetime1(rs.getString(6));
				content.setUserid(rs.getInt(7));
				return content;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public List<ContentModel> search(int id, String title) {
		
		List<ContentModel> listcontent = new ArrayList<ContentModel>();
		String sql ="select * from content where authorid=? and ((title like ?) or (brief like ?))";
		
		try {
			
			Connection con = super.getConnect();
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1, id);
			ps.setString(2, title+"%");
			ps.setString(3, title+"%");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				listcontent.add(new ContentModel(	rs.getInt(1),
													rs.getString(2),
													rs.getString(3),
													rs.getString(4),
													rs.getString(5),
													rs.getString(6),
													rs.getInt(7)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listcontent;
	}	
	
}
